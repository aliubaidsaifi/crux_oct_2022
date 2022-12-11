package lec_2;

import java.util.Scanner;

public class pri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        for (int i = 2; i <= n - 1; i++)
        {
            if (n % i == 0) {
                fact++;
            }
            if (fact == 0) {
                System.out.println("not prime");
            } else {
                System.out.println(" prime");
            }
        }
    }
}
