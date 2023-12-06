package assignments;

public class FindingPrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) { //burada 2'den 100'e kadar olan sayıları başlattık
            int sayac = 0; //sayacı burada tanımladık ki döngünün başına döndüğü zaman kendini sıfırlasın
            for (int j = 1; j <= i; j++) { //burada bölenleri tanımladık, i sayısına kadar tanımladık
                if (i%j == 0) {
                    sayac++; //burada tam bölen sayıların kaç tane olduğunu buluyoruz
                }
            }

            if (sayac <= 2) { //asal olma koşulu sadece kendisine ve 1e bölünmesi bu da maksimumu 2 bölen eder
                System.out.print(i + " ");
            } else {
                System.out.print("");
            }
        }
    }
}
