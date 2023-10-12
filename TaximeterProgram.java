package assignments;

import java.util.Scanner;

public class TaximeterProgram {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double km, perKm = 2.20, openingPrice = 10, price, finalPrice;

        System.out.print("please enter the distance traveled in kilometers: ");
        km = input.nextDouble();

        price = (km * perKm) + openingPrice;

        finalPrice = (price<20) ? 20 : price;

        System.out.println("the distance: " + km);
        System.out.println("the price that you have to pay: " + finalPrice);



    }
}

