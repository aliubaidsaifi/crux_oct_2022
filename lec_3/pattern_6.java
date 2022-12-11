package lec_3;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            space=space+2;
            row++;
            star=star-1;
            System.out.println();


        }
    }
}