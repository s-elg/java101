package assignments;

import java.util.Scanner;
public class Diamonds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("lütfen bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) { //boşluk için yıldızın olduğu sıra+boşluk=n i sıra oluyo
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = (n - 1); i >= 0; i--) {
            for (int k = 0; k < (n - i); k++) { //boşluk için yıldızın olduğu sıra+boşluk=n i sıra oluyo
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}