import java.util.*;
class DivandMod {
    public static void main(String[] args) {
        int num1;
        int num2;
        int eq1;
        int eq2;
        int eq3;
        int eq4;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = input.nextInt();
        System.out.println("Enter a second integer: ");
        num2 = input.nextInt();
        input.close();
        eq1 = (num1 / num2);
        eq2 = (num1 % num2);
        eq3 = (num2 / num1);
        eq4 = (num2 % num1);
        System.out.println(num1 + " / " + num2 + " = " + eq1);
        System.out.println(num1 + " % " + num2 + " = " + eq2);
        System.out.println("\n");
        System.out.println(num2 + " / " + num1 + " = " + eq3);
        System.out.println(num2 + " % " + num1 + " = " + eq4);
    }
}
