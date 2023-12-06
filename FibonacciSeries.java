package assignments;

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen fibonacci serisinin eleman sayısını giriniz: ");
        int number = input.nextInt();
        int previousNum = 0, currentNum = 1, nextNum; //başlangıç değerleri belirledik

        for(int i = 0; i <= number; i++) {
            nextNum = previousNum + currentNum; //serinin genel kuralı
            System.out.println(previousNum + " + " + currentNum + " = " + nextNum); //yazdırma işlemi
            previousNum = currentNum; //burada da sayıları kaydırıyoruz
            currentNum = nextNum;
        }
    }
}
