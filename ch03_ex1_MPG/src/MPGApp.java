import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        Scanner sc = new Scanner(System.in); // create a new scanner named "sc"
        String input; // create a string named "input"
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // start the program by asking for user input and then process it
            System.out.print("Enter miles driven: ");
            input = sc.nextLine(); // scan the next line to define "input"
            double miles = Double.parseDouble(input); // analyze "input" as a double named miles
            
            // ask for the next input and process it
            System.out.print("Enter gallons of gas used: ");
            input = sc.nextLine(); // scan the next line to redefine "input"
            double gallons = Double.parseDouble(input); // analyze "input" as a double named gallons
            
            // use inputs to calculate results
            double mpg = miles/gallons; // define a double named "mpg" (miles per gallon) as the result of miles divided by gallons
            NumberFormat number = NumberFormat.getNumberInstance(); // create a number-based instance for the new NumberFormatted variable named "number"
            number.setMaximumFractionDigits(2); // set the maximum digits after the decimal point of the value of "number"
            String mpgString = number.format(mpg); // format the 
            int mpgWhole = (int) mpg; // convert "mpg" into an integer named "mpgWhole"
            mpg = (double) Math.round(mpg * 100) / 100; // round "mpg" to the nearest hundredth number

            // display results
            System.out.println("Miles per gallon is " + mpgString + "."); // (Change "mpgString" to "mpg" to switch between NumberFormat and Math class results respectively)
            System.out.println(); 
            
            // ask to restart
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.nextLine(); // scan the next line to redefine "choice"
            System.out.println();
        }
    }
}
