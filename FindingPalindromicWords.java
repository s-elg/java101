package assignments;

import java.util.Scanner;

public class FindingPalindromicWords {
    static boolean isPalindrome(String str) { //bu methodta tersten giderek başka bir stringe atarak karşılaştırdık
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i-- ){ //str.length() - 1 yazmamızın sebebi array indisleri 0'dan başlıyor. bir eksiği olacak yani
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    static boolean isPalindrome2(String str) { //bu methodta ise girilen stringin baş ve son karakterlerinden başlayarak karşılaştırma yaptık
        int i = str.length() - 1, j = 0;
        while (j < i) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen bir kelime girinz: ");
        String word = scan.nextLine();

        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome2(word));



    }
}
