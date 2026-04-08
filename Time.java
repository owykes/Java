public class Time {
    public static void main(String [] args) {
        int hour = 15;
        int minute = 9;
        int second = 3;

        int totalSeconds = ((hour * 60) * 60) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + totalSeconds + " seconds");

        int seconds_in_a_day = 60 * 60 * 24;
        double percentage = (totalSeconds / (double) seconds_in_a_day) * 100;  
        System.out.println("Percentage of the day pass: " + percentage + "%");
    }
}
