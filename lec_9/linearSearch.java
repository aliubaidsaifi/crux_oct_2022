package lec_9;

public class linearSearch {
    public static void main(String[] args) {
        int n = 4;
        int [] arr = {1,2,3,4,6,5};
        System.out.println(search(arr,4));

    }
    public static int search(int[] arr,int n){
        for(int i = 0; i<=arr.length-1;i++){
            if(arr[i]==n){
                return i;
        }
    }
        return -1;
    }
}
