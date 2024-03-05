import java.util.*;
public class TimeConversion {
    public static void main(String[]args){
        int ogminutes;
        int minutes;
        int minutesTens;
        int minutesOnes;
        int hours;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        ogminutes = input.nextInt();
        input.close();
        minutes = ogminutes % 60;
        minutesOnes = minutes % 10;
        minutesTens = (minutes - minutesOnes)/10;
        hours = ((ogminutes-minutes)/60);
        System.out.println("The time is: " + hours + ":" + minutesTens + minutesOnes);
        }
}
