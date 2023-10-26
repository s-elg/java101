package assignments;

import java.util.Scanner;

public class LoopsEvenAndQuadrupleNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, total = 0;

        do{
            System.out.print("enter a number: ");
            number = scan.nextInt();
            if (number % 4 == 0)
                total += number;
        } while (number % 2 == 0);

        System.out.println("the sum of the numbers you entered: " + total);
    }
}
