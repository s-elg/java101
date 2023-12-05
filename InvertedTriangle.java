package assignments;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int k = 0; k < (number - i); k++) { //boşluk için yıldızın olduğu sıra+boşluk=n i sıra oluyo
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
