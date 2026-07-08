public class Expansion {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static double myexp(double x, int n) {
        // Taylor series estimation
        double sum = 1;
        double numerator = 1;
        double denominator = 1;
        
        for (int i = 1; i < n; i++) {
            numerator *= x;
            denominator *= i;
            double term = numerator / denominator;
            sum += term;
        }
        return sum;    
    }
}
