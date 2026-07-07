import java.math.BigInteger;

public class Big {

    public static BigInteger factorial(int n) {
        if (n <= 0) {
            return BigInteger.ONE;  // 0! = 1, and the book doesn't care about negatives
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "    " + factorial(i));
        }
    }
}