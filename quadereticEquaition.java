package assign_3;

import java.util.Scanner;

public class quadereticEquaition {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = ((b*b)-(4*a*c));
        int sqrt = (int)(Math.sqrt(d));
        int first = 0;
        int second = 0;
       if (d>0) {
            int root1 = ((-b+sqrt)/(2*a));
            int root2 = ((-b- sqrt)/(2*a));
            if(root1>root2){
                first=root1;
                second=root2;

            }else {
                first = root2;
                second =root1;
            }
            System.out.println("Real and Distinct");
            System.out.println(first+" "+second);
        }else if(d==0) {
           int root = -b/2*a;
           System.out.println("Real and Equal");
           System.out.println(first+" "+first);
        }else if(d<0){
           int root = -b/2*a;
           System.out.println("imaginary");
       }
    }
}
