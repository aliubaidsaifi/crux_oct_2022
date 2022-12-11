package lec_9;

public class swapNumber {
     public static void main(String[] args) {
          int [] arr = {2,3,7,4,5,6};
          System.out.println(arr[0]+" "+arr[1]);
          Swap(arr,1,0);
          System.out.println(arr[0]+" "+arr[1]);

     }

     public static void Swap (int[] arr,int i,int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

     }
}
