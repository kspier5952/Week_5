/**
 * Name: Katelyn Spier
 * Date: 3/13/24
 * App Name: Taxi.java
 */
import java.util.*;
public class Taxi {
    public static void main(String[]args){
        int passengers;
        int taxis;
        int leftover;
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of passengers: ");
        passengers = input.nextInt();
        input.close();
        leftover = (passengers%4);
        num1 = (passengers - leftover);
        taxis = (num1/4);
        System.out.println(taxis + " cabs are required");
        System.out.println(leftover + " passenger(s) will be left over");
    }
}
