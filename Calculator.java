package assignments;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, selection;

        System.out.print("enter the first number: ");
        n1 = input.nextInt();
        System.out.print("enter the second number: ");
        n2 = input.nextInt();

        System.out.print("select operation (1-addition, 2-substraction, 3-multiplication, 4-division): ");
        selection = input.nextInt();

        switch (selection){
            case 1:
                System.out.println("your result: " + (n1+n2));
                break;
            case 2:
                System.out.println("your result: " + (n1-n2));
                break;
            case 3:
                System.out.println("your result: " + (n1*n2));
                break;
            case 4:
                System.out.println("your result: " + (n1/n2));
                break;
            default:
                System.out.println("you entered a wrong number!");
        }
    }
}
