package lec_8;

import java.util.Scanner;

public class isArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsArmstrong(n));
    }
    public static boolean IsArmstrong (int n){
        int c= countOfDigit(n);
        int temp=n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem,c));
            n/=10;
        }
        return sum==temp;
    }public static int countOfDigit(int n) {
        int c = 0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;

    }
}
