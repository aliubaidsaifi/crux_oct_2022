package assignment;

import java.util.Scanner;

public class  count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int count = 0, temp = 0;

        while (n>0){
            temp = n%10;
            n = n/10;
            if (temp == digit){
                count++;
            }
        }
        System.out.println(count);

    }
}
