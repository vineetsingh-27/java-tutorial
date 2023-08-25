package data_structures.binary_search;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {

        //Not a sorted array
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };

        System.out.println(Arrays.toString(search(arr,29)));
    }

    static int[] search(int[][] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start < arr.length && end >=0){
            if (arr[start][end] == target){
                return new int[]{start,end};
            }if (arr[start][end] < target){
                start++;
            }else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
