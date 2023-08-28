package practice_question_arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        getConcatenation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
