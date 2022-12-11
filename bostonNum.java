package assign_3;

import java.util.Scanner;

public class bostonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int i = 2;
        int sum = 0;
        int sum1 = 0;
        while(i<=n) {
            if (n % i == 0) {
                sum += i;
                n /= i;
            } else {
                i++;
            }

        }
            while (temp > 0) {
                int rem = temp % 10;
                sum1 = sum1 + rem;
                temp /= 10;
            }
            if (sum == sum1) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }


    }}

