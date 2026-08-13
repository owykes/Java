package algorithms.searching;

import algorithms.utils.Helper;
import java.util.Arrays;

public class BinarySearch {
    public static int[] algorithm(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            int guess = array[mid];
            
            if (guess == target) {
                int[] ans = {mid, steps};
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
        int [] my_list = Helper.generateList(10);
        Arrays.sort(my_list);
        int [] sorted = my_list;
        int target = Helper.getTarget(my_list);
        int [] result = algorithm(sorted, target);
        System.out.println(Arrays.toString(my_list));
        System.out.println("Target: " + target);
        System.out.println("Index: " + result[0]);
        System.out.println("Steps: " + result[1]);
    }
}