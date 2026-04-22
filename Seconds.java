import java.util.Scanner ;

public class Seconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

        System.out.print("Enter an amount of seconds to be converted: ");
        int totalSeconds = in.nextInt();

        // calculate the result
        int hours = totalSeconds / SECONDS_PER_HOUR;
        int remaining = totalSeconds % SECONDS_PER_HOUR;
        int minutes = remaining / SECONDS_PER_MINUTE;
        int seconds = remaining % SECONDS_PER_MINUTE;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n", totalSeconds , hours, minutes, seconds);

    }
}
