package Round1.no322;

import java.util.Arrays;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int dp[] = new int[amount + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1;i<=amount;i++){
            for(int j = 0;j<len;j++){
                if(coins[j]<=i && dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount];

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{1,2,5},11));
    }

}
