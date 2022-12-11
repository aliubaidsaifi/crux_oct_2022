package lec1;

public class grade {
    public static void main(String[] args) {
        int marks = 95;
        if (marks>=75){
            System.out.println("a");
        } else if(marks>=60 && marks<70) {
            System.out.println("b");

        }else if(marks<60 && marks>=50) {
            System.out.println("c");
        }else if(marks<50 && marks>=40) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
}}
