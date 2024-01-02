package assignments;

public class ArrayHarmonicSum {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            double harmonicSerie = 0;
            for (int i : numbers) {
            harmonicSerie += (double) 1 / i;
            }
        System.out.println(numbers.length / harmonicSerie);
    }
}
