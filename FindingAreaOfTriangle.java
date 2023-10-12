package assignments;

import java.util.Scanner;
public class FindingAreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c, u; //variables were defined by developer (me)
        double area;

        System.out.print("please enter the edge a of triangle: "); // datas were received from the user
        a = input.nextInt();

        System.out.print("please enter the edge b of triangle: ");
        b = input.nextInt();

        System.out.print("please enter the edge c of the triangle: ");
        c = input.nextInt();

        u = (a+b+c)/2; //variable was defined according to datas

        area = Math.sqrt(u * (u - a)* (u - b) * (u - c)); //area was calculated according to datas

        System.out.println("side a: " + a);
        System.out.println("side b: " + b);
        System.out.println("side c: " + c);
        System.out.println("the area of the triangle according to datas that you give: " + area);
    }
}
