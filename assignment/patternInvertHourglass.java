package assignment;

import java.util.Scanner;

public class patternInvertHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-1;
        int digit = n;
        while(row<=2*n+1){
            int i = 1;
            int val = n;
            while(i<=star){
                System.out.print(val+" ");
                val--;
                i++;

            }


            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            int val2 = digit;
            if(digit==0||row==n+1){
                val2=1;
                k=2;
            }
            while(k<=star){
                System.out.print(val2+" ");
                val2++;
                k++;
            }
            if (row<=n){
                star++;
                space-=2;
                digit--;

            }else{
                star--;
                space+=2;
                digit++;
            }

            row++;
            System.out.println();
        }
    }
}
