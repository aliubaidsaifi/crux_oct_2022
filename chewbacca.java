package assign_3;

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long pos = 0;
        long rev = 0;
        while(n!=9 && n!=0) {
            long rem = n % 10;
            sum = 9 - rem;
            if (sum < rem) {
                rev += (long) (sum * Math.pow(10, pos));

            } else if (sum > rem) {
                rev += (long) (rem * Math.pow(10, pos));
            }
            n /= 10;
            pos++;
        }if(n==9) {
            rev += (long) (n * Math.pow(10, pos));
            }
        System.out.println(rev);
    }
}
