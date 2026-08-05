package algorithms.searching;

public class BinarySearch {
    public static int algorithm(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            int guess = array[mid];
            
            if guess == target {
                int[] ans = 
                return mid, steps;
            }
        }

    }
}
