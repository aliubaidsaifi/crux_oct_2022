package practiceOfPattern;

import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int  star = n;
        while(row<=n-1){
            int i = 1;
            while (i<=star){
                if(row==1 || row==n-1 || i==1 || i==n){
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
