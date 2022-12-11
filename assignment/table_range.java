package assignment;

        import java.util.Scanner;

        public class table_range {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();
                for(int i =1; m*i<=n*m; i++ ){
                    System.out.println(m*i);
                }
            }
        }

