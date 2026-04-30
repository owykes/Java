import java.util.Scanner; 

public class Quadratic {

    public static void equation(int a, int b, int c) {
        
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
