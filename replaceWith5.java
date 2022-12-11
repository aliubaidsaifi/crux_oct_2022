package assign_3;

import java.util.Scanner;
public class replaceWith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 0){
            System.out.println(5);

        }else{
            long ans =0;
            long pow = 1;
            while(n > 0){
                long rem = n%10;
                if(rem == 0){
                    ans = ans+(5*pow);
                }else{
                    ans = ans+(rem*pow);
                }
                n/=10;
                pow*=10;
            }
            System.out.println(ans);
        }


    }
}
