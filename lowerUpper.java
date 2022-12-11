package assign_3;

import java.util.Scanner;

public class lowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(97);
        if(ch>=97 && ch<=122){
            System.out.println("Lowercase");
        }else if(ch>=65 && ch<=90){
            System.out.println("Uppercase");
        }else{
            System.out.println("Invalid");
        }
    }
}
