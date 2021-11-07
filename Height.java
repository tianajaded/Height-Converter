
/*
@Tiana Noll-Walker
@09/25/2021
HW3: Height Converter
Standard
*/

//import utility
import java.text.DecimalFormat;

// Define class and method  
public class Height {
    public static void main(String[] args) {
        // define scanner to get inputs
        var scanner = new java.util.Scanner(System.in);
        System.out.print("Please enter height to be converted.\n");
        System.out.print("First, enter the feet.");
        // get int input for inches
        int feet = scanner.nextInt();
        System.out.print("Next, enter the inches.");
        // get int input for feed
        int inches = scanner.nextInt();
        // print inputs and ask for cm input
        System.out.print(
                "Your height is " + feet + " feet " + inches + " inches, or " + (12 * feet + inches) + " inches.");
        System.out.print(" This is " + ((12 * feet + inches) * (2.54)) + " cm.\n");
        System.out.print("Please enter a second height to be converted.\n");
        System.out.print("Enter the height in centimeters: ");
        // get cm input
        int centimeters = scanner.nextInt();
        // format for 3 decimal places
        DecimalFormat df = new DecimalFormat("###.###");
        System.out
                .print("Your height is " + centimeters + " cm," + " or " + df.format(centimeters / 2.54) + " inches.");
        scanner.close();

    }
}