package assign_3;

import java.util.Scanner;

public class printPrimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact = 0;
        int i = 2;
        while (i<=n) {
            int j = 2;
            fact = 0;
            while (j < i) {
                if (i % j == 0) {
                    fact++;
                    break;
                }
                j++;
            }
            if (fact == 0) {
                System.out.println(i+"\n");


            }
            i++;
        }
    }
}