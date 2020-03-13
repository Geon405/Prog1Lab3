import java.util.Scanner;

public class Question3 {

    public static void main (String [] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the current temperature in Celsius: ");
        double t = kb.nextDouble();

        System.out.printf("Condition: %s\n", (t > 0) ? "Hot" : "Cold");
    }
}
