package lec_3;

import java.util.Scanner;


        public class pattern5 {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int row = 1;
                int star = 1;
                int space = n-1;
                while(row<=n){
                    int i = 1;
                    while(i<=space){
                        System.out.print("  ");
                        i++;
                    }
                    //star
                    int j = 1;
                    while(j<=row){
                        System.out.print("* ");
                        j++;
                    }
                    System.out.println();
                    row++;
                    star++;
                    space--;


                }
            }
        }

