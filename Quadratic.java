import java.util.Scanner; 

public class Quadratic {

    public static void equation(int a, int b, int c) {
        // refuse division by zero
        if (a == 0) {
            System.err.println("You cannot divide by zero in a quadratic equation");
            return;
        }
        
        //sum under the square root
        double discriminant = b * b - 4 * a * c;
        // refuse a square root of a negative number
        if (discriminant < 0) {
            System.err.println("You cannot take a square root of a negative number");
            return;

        } else if (discriminant == 0) {
                double root = -b / (2.0 * a);
                System.out.println("One solution: " + root);
                return;
            
        } else {
            double numeratorPositive = -b + Math.sqrt(discriminant);
            double numeratorNegative = -b - Math.sqrt(discriminant);
            double denominator = 2.0 * a;
        
            double root1 = numeratorPositive / denominator;
            double root2 = numeratorNegative / denominator;

            System.out.printf("root one = %.2f and root two = %.2f", root1, root2);
        }        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer to represent a ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        } 
        int a = in.nextInt();
           
        System.out.print("Enter an integer to represent b ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        } 
        int b = in.nextInt();
        
          System.out.print("Enter an integer to represent c ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        } 
        int c = in.nextInt();

        equation(a, b, c);
    }
}
