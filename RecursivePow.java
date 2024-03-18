package assignments;
import java.util.Scanner;

public class RecursivePow {

    public static int findingPow(int number, int pow){
        int result = 1;
        /*for (int i = 1; i <= pow; i++){
            result = number * result; //for döngüsüyle üs alma işlemi
        }*/
        if (number == 1 || pow == 0){
            return 1;
        }
        return result = number * findingPow(number, pow-1); //5^4 için yapılacak işlem: 5 * 5^3
                                                                                                 //5 * 5^2 (...)
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("üssü alınacak sayıyı giriniz: ");
            int a = input.nextInt();

            System.out.print("üssü giriniz: ");
            int b = input.nextInt();

            int result = findingPow(a, b);
            System.out.println(result);

        }

    }

}
