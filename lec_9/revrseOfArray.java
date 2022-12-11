package lec_9;

public class revrseOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 7};
        reverse(arr);
      for(int i = 0; i<arr.length;i++){
          System.out.print(arr[i]+" ");

      }

    }

    public static int reverse(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return i;
    }

}

