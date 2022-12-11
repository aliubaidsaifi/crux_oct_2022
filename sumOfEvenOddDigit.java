package assign_3;

import java.util.Scanner;

public class sumOfEvenOddDigit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int pos = 1;
     int sumOdd = 0;
     int sumEven = 0;
     while(n>0){
         int rem  = n%10;
         if(pos%2!=0){
             sumOdd = sumOdd+rem;
         }else{
             sumEven = sumEven + rem;
         }
         pos++;
         n=n/10;
         }
        System.out.println(sumOdd);
        System.out.println(sumEven);

     }
    }

