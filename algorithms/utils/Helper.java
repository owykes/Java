package algorithms.utils;

import java.util.Random;

public class Helper {
    public static int[] generateList(int n) {
        //Generate random list of n unique integers from 1 to 100 
        Random rand = new Random();
        int[] array = new int[n];
        

        // take unique set of numbers
        for (int i = 0; i < n; i++){
            array[i] = rand.nextInt(100) + 1;
        }

        return array;
    }

    public static int getTarget(int arr[]) {
        //pick a random target value from a list - type cast for random to allow only ints
        int index = (int) (Math.random() * arr.length);
        return arr[index];
    }



}