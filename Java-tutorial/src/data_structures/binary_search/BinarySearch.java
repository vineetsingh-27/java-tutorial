package data_structures.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10,14,18};
        int target = 14;

       int ans =  searchInBinary(arr, target);
        System.out.println(ans + " index");
    }

    private static int searchInBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <=end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
