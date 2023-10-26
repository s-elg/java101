package assignments;

import java.util.Scanner;

public class FindingPowersOfFourAndFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.print("enter a number: ");
        number = scan.nextInt();

        /* for(int i = 1; i <= number; i*=4) {
            System.out.println(i);
        }

        System.out.println("----------------------------------");

        for (int j = 1; j <= number; j*=5) {
            System.out.println(j);
        } */
        for (int i = 1, j = i; i <= number; i *= 4, j *= 5) {
            System.out.println(i + ", " + j);
        }
    }
}
