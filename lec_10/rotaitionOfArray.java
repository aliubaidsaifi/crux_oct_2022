package lec_10;

public class rotaitionOfArray {
    public static void main(String[] args) {
           int [] arr = {1,2,3,4,5,6,7};
           int k = 3;
       // System.out.println(Rotate(arr ));
    }
    public static void Rotate(int[]nums,int k){
        int n = nums.length;
        k = k%n;
        //first n-k element
        reverse( nums, 0,n-k-1);
        //last k k element
        reverse(nums,n-k,n-1);
        //complete arr
        reverse(nums,0,n-1);
    }
    public static void reverse(int[]nums,int i,int j){
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
    }
}
