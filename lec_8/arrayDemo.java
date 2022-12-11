package lec_8;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        int n = arr.nextInt();
        // int array[] =new int[n];//syntex in c/c++;
        int[] ar = new int[n];//syntex in java;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = arr.nextInt();
        }
        Display(ar);
    }
           public static void Display(int[] ar){
            for (int i = 0;i<ar.length;i++){
                System.out.println(ar[i]+" ");
            }

        }
    }

