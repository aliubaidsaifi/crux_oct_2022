package lec_9;

public class SwapNumber2 {

        public static void main(String[] args) {
            int [] arr = {2,3,7,4,5,6};
            System.out.println(arr[0]+" "+arr[1]);
            Swap(1,0);
            System.out.println(arr[0]+" "+arr[1]);

        }

        public static void Swap (int i,int j) {
            int temp = i;
            i = j;
            j = temp;

        }
    }


