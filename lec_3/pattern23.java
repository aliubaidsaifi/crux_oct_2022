package lec_3;

import java.util.Scanner;
public class pattern23 {
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
                if (j%2==0){

                    System.out.print("1 ");}
                else{
                    System.out.print("1 ");
                }
                j++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;


        }
    }

}

