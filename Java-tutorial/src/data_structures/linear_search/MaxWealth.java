package data_structures.linear_search;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,5},
                {3,7},
                {4,5},
                {12,18},
        };

        int max_wealth = maxWealth(accounts);
        System.out.println(max_wealth);
    }

    private static int maxWealth(int[][] accounts) {
        int max = accounts[0][0];
        for (int person = 0; person < accounts.length; person++) {
            int row_sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                row_sum += accounts[person][account];
            }

            if (row_sum > max){
                max = row_sum;
            }
        }
        return max;
    }
}
