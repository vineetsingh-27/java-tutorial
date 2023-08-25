package data_structures.binary_search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 12;

        int ans =  searchInBinary(arr, target);
        System.out.println(ans + " index");
    }

    private static int searchInBinary(int[] arr, int target) {;
        int start = 0;
        int end = arr.length-1;

        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
             return mid;
            }

            if (asc){
                if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid - 1;
                }
            }
        }
        return -1;
    }
}
