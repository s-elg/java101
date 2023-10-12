package assingments;

import java.util.Scanner;

public class GpaCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int math, physics, chem, turkce, his, music, total; //i have defined the variables
        String result;
        double average;

        System.out.println("enter the result of the math exam: "); //i have recieved the datas from user
        math = input.nextInt();

        System.out.println("enter the result of the physics exam: ");
        physics = input.nextInt();

        System.out.println("enter the result of the chemistry exam: ");
        chem = input.nextInt();

        System.out.println("enter the result of the türkçe exam: ");
        turkce = input.nextInt();

        System.out.println("enter the result of the history exam: ");
        his = input.nextInt();

        System.out.println("enter the result of the music exam: ");
        music = input.nextInt();

        total = (math+physics+chem+turkce+his+music);
        average = total/6; //i have calculated the average of the results
        System.out.println(average);


        result = average>60?"PASSED":"FAILED"; //i have made a condition statement about the average
        System.out.println(result);



    }
}
