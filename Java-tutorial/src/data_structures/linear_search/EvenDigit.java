package data_structures.linear_search;

public class EvenDigit {
    public static void main(String[] args) {

        int[] nums = {12,121,2,6,1747,6999,743, -12, -1445};

        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        if (num < 0){
            num = num*-1;
        }
        while (num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}
