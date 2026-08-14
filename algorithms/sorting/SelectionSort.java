package algorithms.sorting;

import java.util.Arrays;

import algorithms.utils.Helper;

public class SelectionSort {
    public static int[] algorithm(int[] array) {
        System.out.println(Arrays.toString(array));
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minSoFar = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minSoFar]) {
                    minSoFar = j;
                } 
            }
            int temp = array[i];
            array[i] = array[minSoFar];
            array[minSoFar] = temp;
         
        }
        return array;
        
    }

    public static void main(String[] args) {
        int[] array = Helper.generateList(10);
        System.out.println(Arrays.toString(algorithm(array)));
    
    }
}
