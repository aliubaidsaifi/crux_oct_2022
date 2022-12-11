package practiceOfPattern;

import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 2*n-1;
        int space = 0;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            star-=2;
            space++;


        }
    }

}
