package assignments;

import java.util.Scanner;
public class SumOfDigitsOfTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen bir sayı giriniz: ");
        int number = scan.nextInt();
        int originalNum = number;
        int sayac = 0, total = 0;

        while(number > 0) {
            number /= 10;
            sayac++;
        }

        for (int i = 1; i<=sayac; i++) {
            int basamak = originalNum % 10;
            originalNum-=basamak;
            originalNum/=10;
            total+=basamak;
        }

        System.out.println("girdiğiniz sayının basamaklarının toplamı: " + total);

    }
}
