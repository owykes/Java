package algorithms.sorting;

import java.util.Arrays;

import algorithms.utils.Helper;

public class InsertionSort {
    public static int[] algorithm(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int step = 1; step < array.length; step++) {
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
                   
        }
        return array;
    }    

    public static void main(String[] args) {
        int[] array = Helper.generateList(10);
        System.out.println(Arrays.toString(algorithm(array)));
    }
}
