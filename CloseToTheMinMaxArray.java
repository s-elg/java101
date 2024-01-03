package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class CloseToTheMinMaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("girilen sayı: ");
        int number = scan.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        int nearestSmall = 0, nearestBig = 0;

        for (int i = 0; i < list.length; i++) {
            if (number < list[i]) {
                nearestSmall = list[i - 1];
                nearestBig = list[i];
                break;
            }
        }

        System.out.println("girdiğiniz sayıdan küçük en yakın sayı: " + nearestSmall);
        System.out.println("girdiğiniz sayıdan büyük en yakın sayı: " + nearestBig);


    }
}
