

import java.util.Scanner;
public class Agetype {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter age");
        int x= scanner.nextInt();
        if(x<13){
            System.out.println("You are a Kid");

        } else if (x>19) {
            System.out.println("You are an Adult");

        }
        else {
            System.out.println("You are a Teenager");
        }
    }
}
