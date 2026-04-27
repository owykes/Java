import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Random random = new Random();
            int number = random.nextInt(100) + 1;

            System.out.println("I'm thinking of a number between 1 - 100\nCan you guess what it is?");
            System.out.print("Type a number: ");
            int guess = in.nextInt();
            
            if (guess == number) {
                System.out.printf("Correct! it was %d!%n", number);
                return;
            }      
            if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            
            // Second attempt
            System.out.print("Try again: ");
            guess = in.nextInt();

            if (guess == number) {
                System.out.printf("Correct! it was %d!%n", number);
                return;
            }
             if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            
            // Third attempt
             System.out.print("Last try: ");
            guess = in.nextInt();

            if (guess == number) {
                System.out.printf("Correct! it was %d!%n", number);
                return;
            }
             if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.printf("Incorrect three times, the number was %d%n!", number);
       
    }
}
