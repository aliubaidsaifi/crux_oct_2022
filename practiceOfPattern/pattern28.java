package practiceOfPattern;

import java.util.Scanner;

public class pattern28 {
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
            int val = row;
            int digit = row;
            while(j<=star){
                System.out.print(val+  " ");
                if(digit<star){
                    val++;
                }else{
                    val--;
                }

                j++;
                digit++;
            }
            System.out.println();
            row++;
            star+=2;
            space--;


        }
        }
    }


