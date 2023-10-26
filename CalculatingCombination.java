package assignments;

import java.util.Scanner;

public class CalculatingCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r, nFactorial = 1, rFactorial = 1, combination;

        System.out.print("enter number of elements: ");
        n = scan.nextInt();
        System.out.print("enter number of elections: ");
        r = scan.nextInt();

        int a = n - r, aFactorial = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        for (int i = 1; i <= a; i++) {
            aFactorial *= i;
        }

        combination = nFactorial / (rFactorial * aFactorial);

        System.out.println("the result of combination: " + combination);


    }
}
