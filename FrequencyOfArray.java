package assignments;

import java.util.Arrays;

public class FrequencyOfArray {

    static boolean isFind(int[] arr, int value) {
        for (int i: arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        /* int frequency = 1;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && list[i] == list[j]) {
                        frequency++;
                    }
                }
                System.out.println(list[i] + " sayısı " + frequency + " kere tekrar edildi.");
            } else if (list[i] != list[i - 1]) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && list[i] == list[j]) {
                        frequency++;
                    }
                }
                System.out.println(list[i] + " sayısı " + frequency + " kere tekrar edildi.");
            }
            frequency = 1;
        }*/

        for (int i = 0; i < list.length; i++) {
            int frequency = 1;
            while ((i + 1) < list.length && list[i] == list[i + 1]) {
                i++;
                frequency++;
            }
            System.out.println(list[i] + " appears " + frequency + " times");
        }
    }
}
