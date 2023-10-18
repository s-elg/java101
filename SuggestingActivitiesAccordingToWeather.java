package assignments;

import java.util.Scanner;
public class SuggestingActivitiesAccordingToWeather {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("please enter the heat fo the weather: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("you can go to skiing");
        }else if ((heat >= 5) && (heat < 10)){
            System.out.println("you can go to cinema.");
        } else if (heat >= 10 && heat <= 15){
            System.out.println("you can go to cinema and picnic!");
        }else{
            System.out.println("you can go to picnic");
        }
    }
}
