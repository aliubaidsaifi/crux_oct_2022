package lec_6;

import java.util.Scanner;

public class conversionFarenhightToCentigraate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min  = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        int i = min;
        while(i<=max){
            int c =(int) ((5.0/9)*(i-32));
            System.out.println(i + "\t" + c);
            i = i+step;
        }
    }
}
