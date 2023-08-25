package data_structures.linear_search;

public class MinNumberArray {
    public static void main(String[] args) {
        int[] arr = {44,13,-9,18,5};

        System.out.println(minArray(arr));
    }

    public static int minArray(int[] arr) {
        //Assume that array is not empty

        int min = arr[0];
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
