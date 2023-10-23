package assignments;

import  java.util.Scanner;

public class ChineseZodiac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear, result;
        String chineseZodiac = "";

        System.out.print("please enter your birth year: ");
        birthYear = input.nextInt();

        result = birthYear % 12;

        switch (result) {
            case 0:
                chineseZodiac = "monkey";
                break;
            case 1:
                chineseZodiac = "rooster";
                break;
            case 2:
                chineseZodiac = "dog";
                break;
            case 3:
                chineseZodiac = "pig";
                break;
            case 4:
                chineseZodiac = "rat";
                break;
            case 5:
                chineseZodiac = "ox";
                break;
            case 6:
                chineseZodiac = "tiger";
                break;
            case 7:
                chineseZodiac = "rabbit";
                break;
            case 8:
                chineseZodiac = "dragon";
                break;
            case 9:
                chineseZodiac = "snake";
                break;
            case 10:
                chineseZodiac = "horse";
                break;
            case 11:
                chineseZodiac = "goat";
                break;
            default:
                System.out.println("you entered a misinformation, try again!");
        }
        System.out.println("here is your chinese zodiac: " + chineseZodiac);
    }
}
