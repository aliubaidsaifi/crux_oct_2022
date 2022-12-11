package assignment;

import java.util.Scanner;

public class hollowRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row = 1;
        int star = 1;
        int space =n-1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j<=n){
                if(row==n||row==1||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
                j++;
            }

              row++;
            space--;
            System.out.println();
        }
    }
}
