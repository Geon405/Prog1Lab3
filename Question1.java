import java.util.Scanner;

public class Question1 {

    public static void main (String [] args) {

        Scanner kb = new Scanner (System.in);
        System.out.print("Enter the radius: ");

        double radius = kb.nextDouble();
        double pi = Math.PI;
        double square = Math.pow(radius,2);
        double area = pi * square;

        if (radius < 0 || radius == 0) {
            System.out.println("Error: Wrong Choice");
        } else {
            System.out.println("Area of cirle: " + area);
        }
    }
}