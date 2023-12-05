package assignments;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = 0;

        System.out.print("lütfen bir sayı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if(n%i == 0) {
                t+=i;
            }
        }


        if(t == n) {
            System.out.println(n + " mükemmel sayıdır");
        } else {
            System.out.println(n + " mükemmel sayı değildir.");
        }

    }
}
