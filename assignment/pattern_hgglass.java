package assignment;

import java.util.Scanner;

public class pattern_hgglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star= n;
        int space = 0;
        while(row<=2*n+1){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int val = star;
            while(j<=2*star+1){
                if(val<0){
                    System.out.print(val*(-1)+" ");
                }else {
                    System.out.print(val + " ");
                }
                if(star<=n){
                    val--;
                }else{
                    val++;
                }
                j++;

            }
                if (row<=n){
                    space++;
                    star--;

                }else{
                    star++;
                    space--;
                }


            row++;
            System.out.println();
        }
    }
}
