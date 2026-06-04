public abstract class PrimeFactors {
    public static boolean arePrimeFactors(int n, int[] arr) {
        int product = 1;
        
        for (int x : arr) {
            if (!isPrime(x)) {
                return false;
            }
            product *= x;
        }

        return product == n;
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
    
    return true;    
    }

    public static void main(String[] args) {    
    }
}
