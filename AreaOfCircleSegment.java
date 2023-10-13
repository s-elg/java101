package assignments;

import java.util.Scanner;

public class AreaOfCircleSegment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14, area;
        int r, alpha;

        System.out.print("please enter the radius of the circle segment: ");
        r = input.nextInt();

        System.out.print("please enter the angle of the circle segment: ");
        alpha = input.nextInt();

        area = (pi * (r * r) * alpha) / 360;

        System.out.println("the radius of the circle segment that you have entered: " + r);
        System.out.println("the angle of the circle segment that you have entered: " + alpha);
        System.out.println("the area of the circle segment: " + area);


    }
}
