package assignment;

import java.util.Scanner;

public class patternRombus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int row = 1;
            int star = 1;
            int space = n-1;
            int digit = 1;

            while(row<=2*n-1){
                int i = 1;
                while(i<=space){
                    System.out.print("  ");
                    i++;
                }
                //star
                int j = 1;
                int val = digit;
                while(j<=star){
                    System.out.print(val+" ");
                    if(j<=star/2){
                        val++;

                    }else{
                        val--;
                    }
                    j++;


                }
                if (row<n){
                    star+=2;
                    space--;
                    digit++;
                }else{
                    space++;
                    star-=2;
                    digit--;
                }
                //star


                System.out.println();
                row++;

            }
        }

}
