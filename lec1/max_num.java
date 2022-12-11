package lec1;

public class max_num {
    public static void main(String[] args) {
        int a = 30;
        int b = 25;
        int c = 29;

        if(a>b && a>c){
            System.out.println("a is max");
        } else if (b>a && b>c) {
            System.out.println("b is max");

        }else {
            System.out.println("c is max");
        }

    }
}
