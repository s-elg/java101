package practices;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("işlem sonucu : " + result);
        return result;
    }
    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("işlem sonucu : " + result);
        return result;
    }
    static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("işlem sonucu: " + result);
        return result;
    }
    static int divide(int a, int b) {
        int result = a / b;
        System.out.println("işlem sonucu: " + result);
        return result;
    }
    static int sub(int a, int b) {
        int result = (int) Math.pow(a,b);
        System.out.println("işlem sonucu: " + result);
        return result;
    }
    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("işlem sonucu: " + result);
        return result;
    }
    static void areaPerimeter(int a, int b) {
        System.out.println("alan: " + a * b);
        System.out.println("çevre: " + 2 * (a + b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "####################\n" +
                "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış\n" +
                "####################";

        while (true) {
            System.out.println(menu);
            System.out.print("lütfen menüden bir işlem seçiniz: ");
            int select = input.nextInt();

            if (select == 0) break;

            System.out.print("lütfen işlem yapmak istediğiniz ilk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    sub(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    areaPerimeter(a,b);
                    break;
                default:
                    System.out.println("geçersiz bir işelm seçtiniz, tekrar deneyiniz!");
            }
        }

        System.out.println("güle güle !! :)");

    }

}
















































