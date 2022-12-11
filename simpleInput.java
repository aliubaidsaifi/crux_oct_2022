package assign_3;

import java.util.Scanner;

public class simpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while(sum>=0){
            int num  = sc.nextInt();
            sum = sum+num;
            if(sum>=0){
                System.out.println(num);

            }
        }
    }
}
