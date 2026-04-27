import java.util.Scanner;

/**
 * Demonstrates input validation
 */

public class Logarithm {

    public static void main(String[] args) {
        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // check format
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }

        // check the range
        double x = in.nextDouble();
        if (x > 0) {
            double y = Math.log(x);
            System.out.println("the log is " + y);
        } else {
            System.out.println("The log is undefined");
        }
    }
}
