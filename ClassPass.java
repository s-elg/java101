package assignments;

import java.util.Scanner;
public class ClassPass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int math, turkce, physics, chem, music, passMark = 55, validMark = 0, classNumber = 0;
        double average;

        System.out.print("enter your math mark: ");
        math = input.nextInt();
        if (math>=0 && math<=100){
            validMark += math;
            classNumber++;
        }

        System.out.print("enter your turkce mark: ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100){
            validMark += turkce;
            classNumber++;
        }

        System.out.print("enter your physics mark: ");
        physics = input.nextInt();
        if (physics>=0 && physics<=100){
            validMark += physics;
            classNumber++;
        }

        System.out.print("enter your chem mark: ");
        chem = input.nextInt();
        if (chem>=0 && chem<=100){
            validMark += chem;
            classNumber++;
        }

        System.out.print("enter your music mark: ");
        music = input.nextInt();
        if (music>=0 && music<=100){
            validMark += music;
            classNumber++;
        }

        average = (double) validMark /classNumber;

        if(average >= passMark) {
            System.out.println("congrats, you succeed!");
        }else {
            System.out.println("you faild your class :(");
        }

        System.out.println("here is your gpa: " + average);

    }
}
