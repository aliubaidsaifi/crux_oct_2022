package practiceOfPattern;

import java.util.Scanner;

public class pattern8 {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int row = 1;
                int  star = n;
                while(row<=n){
                    int i = 1;
                    while (i<=star){
                        if(row==i || row+i==n+1 ){
                            System.out.print("* ");

                        }else{
                            System.out.print("  ");
                        }
                        i++;

                    }
           /* int j = 1;
            while(j<=star){
                System.out.print(" ");
                j++;
            }*/
                    row++;
                    System.out.println();
                }

            }
        }


