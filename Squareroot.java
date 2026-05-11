public class Squareroot {
    public static void function(double a) {
        double oldGuess = 6;
        double newGuess = (oldGuess + a / oldGuess) / 2;

        while (Math.abs(newGuess - oldGuess) >= 0.0001) {
            System.out.println(newGuess);
            oldGuess = newGuess;
            newGuess = (oldGuess + a / oldGuess) / 2;       
        }
    }
    public static void main(String[] args) {
        function(9);
    }

}

