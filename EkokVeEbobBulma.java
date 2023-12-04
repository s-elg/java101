package assignments;

import java.util.Scanner;
public class EkokVeEbobBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, ebob = 1, ekok = 0, ebob2 = 1, enKucuk;

        System.out.print("lütfen n1 sayısını giriniz: ");
        n1 = scan.nextInt();

        System.out.print("lütfen n2 sayısını giriniz: ");
        n2 = scan.nextInt();

        if (n1 < n2) {
            enKucuk = n1;
        } else {
            enKucuk = n2;
        }

        int i = enKucuk;
        while (i >= 1) {
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("girdiğiniz sayıların ebobu: " + ebob);

        System.out.println("###############################");

        int j = 1;
        while (j <= enKucuk) {
            if (n1%j == 0 && n2%j == 0) {
                ebob2 = j;
            }
            j++;
        }
        System.out.println("girdiğiniz sayıların ebobu: " + ebob2);

        System.out.println("###############################");

        int k = 1;
        while (k <= (n1 * n2)) {
            if (k%n1 == 0 && k%n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("girdiğiniz sayıların ekoku: " + ekok);
    }
}
