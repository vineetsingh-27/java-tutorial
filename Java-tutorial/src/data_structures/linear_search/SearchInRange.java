package data_structures.linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;

        System.out.println(searchInRange(arr,target));
    }
    public static boolean searchInRange(int[] arr, int target){

        if (arr.length == 0){
            return false;
        }

        int start = 1;
        int end = 4;
        for (int index = start; index < end; index++){
            int element = arr[index];
            if (target == element){
                return true;
            }
        }
        return false;
    }
}
