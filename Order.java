/**
 * Name: Katelyn Spier
 * Date: 3/13/24
 * App Name: Order.java
 */
import java.text.NumberFormat;
import java.util.*;
public class Order {
    public static void main(String[]args){
         String name;
         int burgers;
         int fries;
         int sodas;
         double firstTotal;
         double tax;
         double lastTotal;
         double moneyGiven;
         double change; 
         double bCost;
         double fCost;
         double sCost;
         NumberFormat money = NumberFormat.getCurrencyInstance();
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your name: ");
         name = input.nextLine();
         System.out.print("Enter the number of burgers: ");
         burgers = input.nextInt();
         System.out.print("Enter the number of fries: ");
         fries = input.nextInt();
         System.out.print("Enter the number of sodas: ");
         sodas = input.nextInt();
         bCost = (burgers * 1.69);
         fCost = (fries * 1.09);
         sCost = (sodas * 0.99);
         firstTotal = (bCost + fCost+ sCost);
         tax = (firstTotal * 0.085);
         lastTotal = (firstTotal + tax);
         System.out.println("Your name is " + name);
         System.out.print("Total before tax: ");
         System.out.println(money.format(firstTotal));
         System.out.print("Tax: ");
         System.out.println(money.format(tax));
         System.out.print("Final Total: ");
         System.out.println(money.format(lastTotal));
         System.out.print("Enter the amount tendered: $");
         moneyGiven = input.nextDouble();
         input.close();
         change = (moneyGiven - lastTotal);
         System.out.print("Change: ");
         System.out.println(money.format(change));
    }
}
