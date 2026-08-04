package algorithms.searching;

import utils.Helper;

public class LinearSearch {

    public static int algorithm(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int target = getTarget();
        int[] array = generateList(); 
        int result = algorithm(array, target);

    }
}

