package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MakingArrayWithUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("oluşturmak istediğiniz dizinin boyutunu giriniz: ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("oluşturmak istediğiniz dizinin elemanlarını giriniz:");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + ". elemanı giriniz: ");
            int element = input.nextInt();
            list[i - 1] = element;
        }

        Arrays.sort(list);
        System.out.println("oluşturduğunuz dizinin sıralanmış hali: " + Arrays.toString(list));



    }
}
