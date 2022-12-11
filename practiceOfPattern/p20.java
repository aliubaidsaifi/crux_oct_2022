package practiceOfPattern;

import java.util.Scanner;

public class p20 {
        public static void main(String[] args) {
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
                while(j<=star){
                    if(row==1||row==n||j==1||j==n/2+1){
                    System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                    j++;
                }
                if (row<n/2+1){
                    star+=2;
                    space--;
                }else{
                    space++;
                    star-=2;
                }
                System.out.println();
                row++;

            }
        }

    }



