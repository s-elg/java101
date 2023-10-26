package assignments;

import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power, number, total = 1;

        System.out.print("üssü alınacak sayıyı giriniz: ");
        number = scan.nextInt();

        System.out.print("sayının üssünü giriniz: ");
        power = scan.nextInt();

        for (int i = 1; i <= power; i++) {
            total *= number;
        }

        System.out.println("sonuc: " + total);
    }
}
