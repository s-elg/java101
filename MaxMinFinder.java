package assignments;

import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0, min = 0;

        System.out.print("kaç tane sayı girmek istersiniz: ");
        int n = input.nextInt();

        if (n <= 2) {
            System.out.println("karşılaştırma yapılması için daha fazla değer girilmesi gerekmektedir.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print("lütfen sayı giriniz: ");
                int k = input.nextInt();

                if (i == 1) { // bu koşulu koymamız lazım ki min değeri bulurken sorun çıkmasın, çünkü üstte min değerini tanımlarken 0 olarak tanımladık
                    max = k;
                    min = k;
                }
                else if (k > max) {
                    max = k;
                }
                else if (k < min) {
                    min = k;
                }

            }
            System.out.println("girdiğiniz sayıların en büyüğü: " + max);
            System.out.println("girdiğiniz sayıların en küçüğü: " + min);
        }
    }
}
