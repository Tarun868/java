import java.util.Scanner;


public class Largesmall {
    public static void main(String[] args) {

        int[] a = {4, 2, -16, -3, 25, 1};
        int l = a[0];
        int s = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > l) {
                l = a[i];
            } else if (a[i] < s) {
                s = a[i];
            }
        }

        System.out.println("Largest number: " + l);
        System.out.println("Smallest number: " + s);
    }
}
