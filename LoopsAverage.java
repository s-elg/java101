package assignments;

import java.util.Scanner;
public class LoopsAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int number, average, total = 0, totalNumbers = 0;

        System.out.print("enter a number: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                totalNumbers++;
            } else {
                continue;
            }
            System.out.println(i);
        }
        average = total/totalNumbers;
        System.out.println("-------------");
        System.out.println("your average: " + average);


    }
}
