import java.util.*;
public class SleepApp {
    public static void main(String[]args){
        int yearBday;
        int monthBday;
        int dayBday;
        int yearNow;
        int monthNow;
        int dayNow;
        int yearsTotal;
        int monthsTotal;
        int daysTotal;
        int hoursSlept;
        System.out.println("Enter your birthdate:");
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        yearBday = input.nextInt();
        System.out.print("Month: ");
        monthBday = input.nextInt();
        System.out.print("Day: ");
        dayBday = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        yearNow = input.nextInt();
        System.out.print("Month: ");
        monthNow = input.nextInt();
        System.out.print("Day: ");
        dayNow = input.nextInt();
        input.close();
        yearsTotal = (yearNow - yearBday);
        monthsTotal = ((yearsTotal * 12) + (monthNow - monthBday));
        daysTotal = ((monthsTotal * 30) + (dayNow - dayBday));
        hoursSlept = (daysTotal * 8);
        System.out.println("You have been alive for " + daysTotal + "days.");
        System.out.println("You have spent " + hoursSlept + "hours sleeping.");
    }
}