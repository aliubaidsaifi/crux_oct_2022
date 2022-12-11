package lec_10;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(RainWater(height));
    }
    public  static int RainWater(int[] height){
        int [] left =new int [height.length];
        left[0] = height[0];
        for (int i = 1; i< left.length; i++){
           left[i] = Math.max(left[i-1],height[i]);
        }
        //right max
        int [] right =new int [height.length];
        int n= height.length;
        right[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        int sum = 0;
        for(int i = 0; i< right.length;i++){
            sum = sum + Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}
