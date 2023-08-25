package data_structures.linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5};
        int target = 4;

        System.out.println(linearSearch(arr,target));
    }

    // Search the element found in the list and return the index or element
    public static int linearSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        // Enhanced for loop
//        for (int result : arr) {
//            if (result == target) {
//                return result;
//            }
//        }
//        return -1;

        for (int index = 0; index<arr.length; index++){
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return -1;
    }
}

