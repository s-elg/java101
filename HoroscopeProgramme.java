package assignments;

import java.util.Scanner;

public class HoroscopeProgramme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        String sign = "";
        boolean isError = false;

        System.out.print("please enter your birth month: ");
        month = input.nextInt();

        System.out.print("please enter your birth day: ");
        day = input.nextInt();

        if (month <= 12) {
            if (month == 1) {
                if (day >= 1 && day <=31) {
                    if (day < 22){
                        sign = "capricorn";
                    } else {
                        sign = "aquarius";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (day >= 1 && day <=28) {
                    if (day < 20){
                        sign = "aquarius";
                    } else {
                        sign = "pisces";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (day >= 1 && day <=31) {
                    if (day < 21){
                        sign = "pisces";
                    } else {
                        sign = "aries";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if (day >= 1 && day <=30) {
                    if (day < 21){
                        sign = "aries";
                    } else {
                        sign = "taurus";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if (day >= 1 && day <=31) {
                    if (day < 22){
                        sign = "taurus";
                    } else {
                        sign = "gemini";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if (day >= 1 && day <=30) {
                    if (day < 23){
                        sign = "gemini";
                    } else {
                        sign = "cancer";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if (day >= 1 && day <=31) {
                    if (day < 23){
                        sign = "cancer";
                    } else {
                        sign = "leo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if (day >= 1 && day <=31) {
                    if (day < 23){
                        sign = "leo";
                    } else {
                        sign = "virgo";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if (day >= 1 && day <=30) {
                    if (day < 23){
                        sign = "virgo";
                    } else {
                        sign = "libra";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if (day >= 1 && day <=31) {
                    if (day < 23){
                        sign = "libra";
                    } else {
                        sign = "scorpio";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if (day >= 1 && day <=31) {
                    if (day < 22){
                        sign = "scorpio";
                    } else {
                        sign = "sagittarius";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 12) {
                if (day >= 1 && day <=30) {
                    if (day < 22){
                        sign = "sagittarius";
                    } else {
                        sign = "capricorn";
                    }
                } else {
                    isError = true;
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("you entered a wrong information, try again!!");
        } else {
            System.out.println("here is your sign: " + sign);
        }

    }
}
