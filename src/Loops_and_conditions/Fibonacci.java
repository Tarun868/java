import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int k,a=0,b=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        for ( int i = 0; i <= n - 1; i++) {
            System.out.println(a);
            k=a+b;
            a=b;
            b=k;
        }
        scanner.close();
    }
}

