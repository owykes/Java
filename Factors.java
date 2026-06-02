public class Factors {
    public static boolean areFactors(int n, int[] arr) {
    
    for (int i = 0; i < arr.length; i++) {
        if ( n % arr[i] != 0) {
            return false;
        }
    }
    return true;
    
    }
}
