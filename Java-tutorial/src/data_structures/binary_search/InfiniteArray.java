package data_structures.binary_search;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,15,16,18,20,22,24,26,28,30,32,34,36,38,40};
        int target = 15;

        int ans = range(arr,target);
        System.out.println(ans);
    }

    static int range(int[] arr,int target){
     int start = 0;
     int end = 1;

     while (target > arr[end]){
         int new_start = end + 1;
         end = end + (end - start + 1) * 2;
         start = new_start;
     }
     return searchInBinary(arr,target,start,end);
    }

    static int searchInBinary(int[] arr, int target, int start, int end) {

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
