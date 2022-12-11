package assignment;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i =1; m*i<=n; i++ ){
            System.out.println(m*i);
        }
    }
}
