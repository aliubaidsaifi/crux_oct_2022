package lec_3;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      /* for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        int row = n;
        int star = 1;
        while(row>=1){
            int i = 1;
            while(i<=row){
                System.out.print(" * " );
                i++;
            }
            System.out.println("");
            row--;

        }
    }
}
