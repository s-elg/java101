package odevler;

import java.util.Scanner;
public class KdvCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kdvRatio, price, kdvPrice, finalPrice; // i have defined the variables

        System.out.print("please enter the price of product you want to buy: "); // i have asked from user to enter the price
        price = input.nextDouble();

        kdvRatio = (price<=1000) ? 0.18 : 0.08; // i have made a statement about KDV ratio

        kdvPrice = price * kdvRatio;

        finalPrice = price + kdvPrice;

        System.out.println("the price without KDV of the product you bought: " + price); //i have printed datas that calculated
        System.out.println("the price of the KDV: " + kdvPrice);
        System.out.println("the price with KDV of the product you bought: " + finalPrice);

    }
}
