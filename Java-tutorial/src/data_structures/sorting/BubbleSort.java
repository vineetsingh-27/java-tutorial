package data_structures.sorting;

import array.Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sorting(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for every swap, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap item if item is smaller than previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if program did not swap for particular value of i, it means that array is sorted hence stop the program.
            if (!swapped){
                break;
            }
        }
    }
}
