package lec_2;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        int fact = 0;
        while(i<n){
            if (n%i==0){
                fact++;

            }
            i++;
        }
        if (fact>=1){
        System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
