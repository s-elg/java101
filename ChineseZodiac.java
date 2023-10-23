package assignments;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, chineseZodiac = "";
        int birthYear;

        System.out.print("please enter your name: ");
        name = input.nextLine();

        System.out.print("please enter your birth year: ");
        birthYear = input.nextInt();

        if (birthYear % 12 == 0) {
            chineseZodiac = "monkey";
        } else if (birthYear % 12 == 1) {
            chineseZodiac = "rooster";
        } else if (birthYear % 12 == 2) {
            chineseZodiac = "dog";
        } else if (birthYear % 12 == 3) {
            chineseZodiac = "pig";
        } else if (birthYear % 12 == 4) {
            chineseZodiac = "rat";
        } else if (birthYear % 12 == 5) {
            chineseZodiac = "ox";
        } else if (birthYear % 12 == 6) {
            chineseZodiac = "tiger";
        } else if (birthYear % 12 == 7) {
            chineseZodiac = "rabbit";
        } else if (birthYear % 12 == 8) {
            chineseZodiac = "dragon";
        } else if (birthYear % 12 == 9) {
            chineseZodiac = "snake";
        } else if (birthYear % 12 == 10) {
            chineseZodiac = "horse";
        } else if (birthYear % 12 == 11) {
            chineseZodiac = "goat";
        } else {
            System.out.println("you entered a misinformation, try again!");
        }

        System.out.println("dear " + name + ", here is your chinese zodiac: " + chineseZodiac);
    }
}
