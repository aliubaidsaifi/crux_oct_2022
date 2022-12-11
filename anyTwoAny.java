package assign_3;

import java.util.Scanner;

public class anyTwoAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        int index = 0;
        //convert to any base to decimal
        while (n > 0) {
            ans += ((n % 10) * (int) Math.pow(source, index++));
            n /= 10;
        }

        //decimal to any base
        int res = 0;
        index = 0;
        while (ans > 0) {
            res += ((ans % dest) * (int) Math.pow(10, index++));
            ans /= dest;
        }
        System.out.println(res);
    }
    }

