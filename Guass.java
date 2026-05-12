public class Guass {

    public static double function(double x, double n) {
        double sum = 1;
        double term = 1;

        for (int i = 1; i <= n; i++) {
            term = term * (-1) * x * x / i;
            sum += term;
        } 
        
        return sum;
    }
    public static void main(String[] args) {
        function(2,5);
    }
}
