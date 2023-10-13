package assignments;

import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kg;
        double height, bmi;

        System.out.print("please enter your weight in kilogram: ");
        kg = input.nextInt();

        System.out.print("please enter your height in meter: ");
        height = input.nextDouble();

        bmi = kg / (height * height);

        System.out.println("your weight is: " + kg);
        System.out.println("your height is: "+ height);
        System.out.println("your body mass index is: " + bmi);



    }
}
