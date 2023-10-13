package assignments;

import java.util.Scanner;
public class GroceryStoreProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double apple = 3.67, pear = 2.14, tomato = 1.11, banana = 0.95, eggplant = 5;

        System.out.print("how many kilograms of pears do you want?: ");
        double pearKg = input.nextDouble();

        System.out.print("how many kilograms of apples do you want?: ");
        double appleKg = input.nextDouble();

        System.out.print("how many kilograms of tomatos do you want?: ");
        double tomatoKg = input.nextDouble();

        System.out.print("how many kilograms of bananas do you want?: ");
        double bananaKg = input.nextDouble();

        System.out.print("how many kilograms of eggplants do you want?: ");
        double eggplantKg = input.nextDouble();

        double pearPrice = pear * pearKg;
        double applePrice = apple * appleKg;
        double tomatoPrice = tomato * tomatoKg;
        double bananaPrice = banana * bananaKg;
        double eggplantPrice = eggplant * eggplantKg;
        double total = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;
        
        System.out.println("the total price: " + total);





    }
}
