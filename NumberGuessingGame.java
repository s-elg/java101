package assignments;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random(); //yukarıda çağırdığımız random sınfından nesne oluşturduk
        Scanner scan = new Scanner(System.in);
        int number = random.nextInt(100); //bu da random sınıfını çağırarak yapılır. içindeki değer sınırı belirler
        //double number = (int) (Math.random() * 100); //0 ile 100 arasında rastgele sayı alıyoruz, parantez int yazınca double sayı int oldu

        int right = 0; //hakkımızı 0dan başlattık, aynı zamanda bu değişkeni indis için de kullanacağız
        int selected;
        int[] wrong = new int[5]; //yanlış girilen değerleri tutması için bir array açtık
        boolean isWin = false; //kazanıp kazanmadığını aşağıda if döngüsüyle kontrol etmek için bu değişkeni açtık
        boolean isWrong = false; //bir kere canından azalmadan yanlış yapma olanağı tanımak için bu değişkeni açtık

        //System.out.println(number);

        while(right < 5) {
            System.out.print("lütfen tahmininizi giriniz: ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) { //burada isWrong true ise hakkından düşürmeye başlayacak
                    System.out.println("çok fazla hatalı giriş yaptınız. kalan hak: " + (5 - ++right));
                } else {
                    isWrong = true; //burada yukarıda false tanımladığımız için bir kez sınır dışından girme hakkını tanıdık, döngünün içinde isWrong = true olarak tanımladık ki tekrar yanlış girildiğinde ilk döngüye girsin
                    System.out.println("bir dahaki hatalı girişinizda hakkınızdan düşülecektir");
                }
                continue; //şartları sağlamıyorsa aşağıdaki işlemleri yapmadan (can azaltma/arttırma vs) direkt döngünün başına gitsin diye konuldu
            }
            if (selected == number) {
                System.out.println("tebrikler, doğru tahmin ettiniz!! tahmin ettiğiniz sayı: " + number);
                isWin = true; //bu şekilde tanımlayarak kazandığını belirleyerek en son olan if döngüsüne girmemesini sağladık
                break;
            } else {
                System.out.println("hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı, aranan sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, aranan sayıdan küçüktür.");
                }
                wrong[right] = selected; //tekrar tekrar int değeri açmamak için elde olan hak değeriyle indis değerini eşleştirdik, zaten hata yapmasıyla artacağı için indis değerlerinde herhangi bir yanlışlık olmayacak.
                System.out.println("kalan hakkınız: " + (5 - ++right));
            }

        }

        if (!isWin) {
            System.out.println("kaybettiniz!!! doğru cevap: " + number);
            if (!isWrong) { //isWrong false ise bu döngüye girecek. yani fazla hata yapmış ise yanlış tahminleri yazdırmayacak
                System.out.println("tahminleriniz: " + Arrays.toString(wrong));
            }
        }

    }
}
