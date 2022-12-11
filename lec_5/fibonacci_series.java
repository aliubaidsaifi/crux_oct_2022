package lec_5;

public class fibonacci_series {
    public static void main(String[] args) {
        int n = 6;
        int a= 0;
        int b= 1;
        int i = 1;
        while(i<=n){
            int c = a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(a);
    }
}
