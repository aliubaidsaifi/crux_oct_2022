package practiceOfPattern;

import java.util.Scanner;

    public class p22 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int row = 1;
            int star =n;
            int space = 0;
            while (row<=n){
                int j = 1;
                while (j<=star){
                    System.out.print("* ");
                    j++;
                }
                int i = 1;
                while(i<=space){
                    System.out.print("  ");
                    i++;
                }
                int k = 1;
                if (row==n){
                    k=2;
                }
                while (k<=star){
                    System.out.print("* ");
                    k++;
                }

              /*  if(row<n/2+1){
                    space+=2;
                    star--;

                }else{
                    space-=2;
                    star++;

                }*/
                row++;
                star++;
                space-=2;
                System.out.println();
            }


        }
    }



