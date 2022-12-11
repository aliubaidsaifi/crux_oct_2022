package assign_3;

import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                fact++;

            }
            if (fact == 2) {
                System.out.println(i);
                i++;
            }

        }
    }
}

