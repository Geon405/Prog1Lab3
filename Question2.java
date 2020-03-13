import java.util.Scanner;

public class Question2 {

    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double Wp = kb.nextDouble();

        System.out.print("Enter the height in feet: ");
        double Hf = kb.nextDouble();

        double Wk = 0.45 * Wp;
        double Hm = 0.3 * Hf;

        double bmi = (Wk / Math.pow (Hm, 2));

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
    }
}