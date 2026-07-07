public class Expansion {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        return result;
    }

    public static double power(double x, int n) {
        
    }
    public static int myexp(double x, int n) {
        //
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += power(x, i) / factorial(i);
        }

    }
}
