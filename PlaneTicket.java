package assignments;

import java.util.Scanner;
public class PlaneTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, tripType;
        double distancePrice = 0.10, price, ageDiscount, discountedPrice, totalPrice, tripDiscount;

        System.out.print("please enter the distance that you will travel: ");
        distance = input.nextInt();

        System.out.print("please enter your age: ");
        age = input.nextInt();

        System.out.print("please select your trip type (1-one direction, 2-round trip): ");
        tripType = input.nextInt();

        if (distance > 0 && age > 0) {
            if (tripType == 2) {
                if (age < 12) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.50;
                    discountedPrice = price - ageDiscount;
                    tripDiscount = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - tripDiscount) * 2;
                    System.out.println("total price: " + totalPrice);

                } else if (age >= 12 && age <= 24) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.10;
                    discountedPrice = price - ageDiscount;
                    tripDiscount = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - tripDiscount) * 2;
                    System.out.println("total price: " + totalPrice);

                } else if (age > 65) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.30;
                    discountedPrice = price - ageDiscount;
                    tripDiscount = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - tripDiscount) * 2;
                    System.out.println("total price: " + totalPrice);

                } else {
                    price = distance * distancePrice;
                    tripDiscount = distancePrice * 0.20;
                    totalPrice = (distancePrice - tripDiscount) * 2;
                    System.out.println("total price: " + totalPrice);

                }
            } else if (tripType == 1) {
                if (age < 12) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.50;
                    totalPrice = price - ageDiscount;
                    System.out.println("total price: " + totalPrice);

                } else if (age >= 12 && age <= 24) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.10;
                    totalPrice = price - ageDiscount;
                    System.out.println("total price: " + totalPrice);

                } else if (age > 65) {
                    price = distance * distancePrice;
                    ageDiscount = price * 0.30;
                    totalPrice = price - ageDiscount;
                    System.out.println("total price: " + totalPrice);

                } else {
                    totalPrice = distance * distancePrice;
                    System.out.println("total price: " + totalPrice);

                }
            } else {
                System.out.println("you entered wrong information, try again!");
            }
        } else {
            System.out.println("you entered wrong information, try again!");
        }
    }

}
