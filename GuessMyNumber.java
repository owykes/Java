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
            
            System.out.printf("Your guess is: %d%n", guess);
            System.out.printf("The number I was thinking of is: %d%n", number);
            
            int difference = Math.abs(number - guess);
            System.out.printf("You were off by: %d%n", difference);
            
            
    }
}
