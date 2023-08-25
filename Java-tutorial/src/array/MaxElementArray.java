package array;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {17,34,55,22,66};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int j : arr) {
            if (j > maxVal) {
                maxVal = j;
            }
        }
        return maxVal;
    }
}
