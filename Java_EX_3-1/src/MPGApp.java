import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line

        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();

            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();

            double mpg = miles/gallons;
            BigDecimal newMPG = new BigDecimal((mpg * 100) / 100);
            newMPG = newMPG.setScale(2, RoundingMode.HALF_UP);
            System.out.println("Miles per gallon is " + newMPG + ".");

            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }

}
