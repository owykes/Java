import java.math.BigInteger;

public class EncryptionBigInt {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;

        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);

        // if n is even, the result is t sqaured
        // if n is odd, the result is t sqaured times x
        BigInteger result = t.multiply(t);
        
        if (n % 2 == 0) {
            return result;
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
