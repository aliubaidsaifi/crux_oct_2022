package assignment;

import java.util.Scanner;

public class doubleSidedArrrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        int sp2 = -1;
        while(row<=n){
            int i = 1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val=star;
            while(j<=star) {
                System.out.print(val + " ");
                if (j <= star) {
                    val--;
                } else {
                    val++;
                }
                j++;
            }
             int k = 1;
             while(k<=sp2){
                 System.out.print("  ");
                 k++;
             }
             int l = 1;
             if(row==1||row==n){
                 l=2;
             }
             int val2 = 1;
             while(l<=star){
                 System.out.print(val2+" ");
                 if(l<=star){
                     val2++;
                 }else{
                     val2--;
                 }
                 l++;
             }
            if (row<=n/2){
                space-=2;
                star++;
                sp2+=2;

            }else{
                space+=2;
                star--;
                sp2-=2;
            }


            row++;
            System.out.println();
        }
    }
}
