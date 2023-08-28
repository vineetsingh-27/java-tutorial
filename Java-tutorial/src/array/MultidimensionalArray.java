package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
        */

//        int[][] arr = new int[3][3];

        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
//        System.out.println(Arrays.toString(arr2D[0]));


        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for (int [] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
