package assignment;

import java.util.Scanner;

public class patternZero {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        while(row<=n) {
            int i=1;
            while(i<=row) {
                if(i==1|| i==row) {
                    System.out.print(row+" ");
                }
                else
                {
                    System.out.print("0 ");
                }

                i++;
            }
            System.out.println(" ");
            row++;

        }
    }

}
