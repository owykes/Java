public class OddRecursion {
    public static int oddSum(int n) {
        if (n == 1) {
            return n;
        }
        if (n % 2 != 0) {
            return n + oddSum(n - 2);
        }
        return oddSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(oddSum(12));    
    }
}
