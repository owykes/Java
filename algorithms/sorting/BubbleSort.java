package algorithms.sorting;

import java.util.Arrays;
import algorithms.utils.Helper;

public class BubbleSort {
    public static int[] algorithm(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = array.length; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i - 1; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                return array;
            }
        }
        return array;          
    }
    public static void main(String[] args) {
        int[] array = Helper.generateList(10);
        System.out.println(Arrays.toString(algorithm(array)));

    }
}
