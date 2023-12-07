package assignments;

public class PalindromeNumber {

    static boolean isPalindrome (int number) {
        int originalNumber = number, reverseNumber = 0, lastNumber;

        while (number != 0) {
            lastNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            number /= 10;
        }

        return reverseNumber == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(741));
        System.out.println(isPalindrome(7447));
        System.out.println(isPalindrome(35753));
        System.out.println(isPalindrome(257));
    }
}
