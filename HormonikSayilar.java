package practices;

import java.util.Scanner;

public class HormonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
       // int i = 1;
        double total = 0;

        System.out.print("harmonik serisi hesaplanacak sayıyı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            total += (double) 1 /i;
        }

       /*
       while (i <= number) {
            total += (double) 1 /i;
            i++;
        }
        */

        System.out.println("harmonik seri sonucu: " + total);
    }
}
