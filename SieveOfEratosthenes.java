
public class SieveOfEratosthenes {

    public static boolean [] sieve (int n) {
        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
            
        for (int p = 2; p * p < n; p++) {       
            if (isPrime[p]) {
                for (int i = p*p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }     
        return isPrime;
    }   

    public static void main(String[] args) {
    //new boolean array to loop and print the results better
    boolean[] primes = sieve(30);

    for (int i = 0; i < primes.length; i++) {
        if (primes[i]) {
            System.out.print( i + " ");
        }
    } 
    
    }
}