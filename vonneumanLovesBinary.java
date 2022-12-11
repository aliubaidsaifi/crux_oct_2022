package assign_3;

import java.util.Scanner;

public class vonneumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n) {
            int num = sc.nextInt();
            int sum = 0;
            int mul = 1;
            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem * mul;
                num = num / 10;
                mul = mul * 2;

            }
            System.out.println(sum);
            i++;
        }
    }

}