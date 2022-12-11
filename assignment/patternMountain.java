package assignment;

import java.util.Scanner;

public class patternMountain {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int row = 1;
                int star = 1;
                int space=2*n-3;
                while(row<=n){
                    int i = 1;
                    while(i<=star){
                        System.out.print(i+" ");
                        i++;
                    }
                    int k = 1;
                    while(k<=space){
                        System.out.print("  ");
                        k++;
                    }
                    int j = 1;
                    int val=star;
                    if(star==n){
                        val =star-1;
                        j=2;
                    }
                    while(j<=star){
                        System.out.print(val+" ");
                        j++;
                        val--;
                    }
                    if(star<=n){
                        star++;
                    }else{
                        star--;
                    }


                    System.out.println();
                    row++;
                    space-=2;


                }
            }

        }
