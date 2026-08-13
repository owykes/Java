package algorithms.searching;

import utils.Helper;

public class BinarySearch {
    public static int[] algorithm(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            int guess = array[mid];
            
            if guess == target {
                int[] ans = mid, steps;
                return ans;
            }

            if (guess > target) {
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return new int[] {-1, steps};

    }

    public static void main(String[] args) {
        int [] my_list = generateList();
        //insert sorted list when helper fucntion written   
        int target = getTarget();
        int [] result = algorithm(sorted, target);
    }
}
