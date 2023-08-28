package data_structures.linear_search;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7,8},
                {11,9,14}
        };


        System.out.println(maxIn2DArray(arr));
    }

    private static int maxIn2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
