import java.util.Scanner;

public class Triangle {
    // Triangle Inequality Theorem

    public static void equation(int a, int b, int c) {
        if (a < 1|| b < 1 || c < 1) {
            System.err.print("The lengths cannot be negative or zero");
            return;
        }
        if (a > b + c || b > c + a || c > a + b) {
            System.out.println("You cannot form a triangle with those 3 lengths");
        } else {
            System.out.println("You can form a triangle with those 3 lengths");
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
