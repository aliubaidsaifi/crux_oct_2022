package lec_3;
import java.util.Scanner;
public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 1; i<n; i++){
           for(int j = 1; j<=i;j++){
               System.out.print("* ");
           }
           int spaces = 2*(n-i);
           for(int j =1; j<=spaces;j++){
               System.out.print("   ");
           }
           for(int j=1;j<=i; j++){
               System.out.print("* ");
           }
            System.out.println();
           }
        }
    }