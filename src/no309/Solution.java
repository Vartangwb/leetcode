package no309;

/**
 * Created by twb on 2017/5/20.
 */
public class Solution {

    public int maxProfit(int[] prices) {
        /* https://leetcode.com/discuss/71391/easiest-java-solution-with-explanations
         because of cooldown, after sell, we need cool down one day
         buy[i] = Math.max(buy[i - 1] ,  sell[i - 2] - prices[i]);  两种情况：在第i天可以不买不卖（cooldown） 维持第i-1的profit；或者i-2 卖掉，在i天买入。取两种情况的profit
         sell[i] = Math.max(sell[i - 1],  buy [i - 1] + prices[i]); 也是两种情况：不买不卖； 或者卖掉prices[i], profit 为buy [i - 1] + prices[i]。 取两种情况最大值
         */

        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int[] buy = new int[prices.length]; // the profit after buy a price[i] or cooldown
        int[] sell = new int[prices.length];

        buy[0] = -prices[0];
        sell[0] = 0;
        buy[1] = Math.max(buy[0], -prices[1]);
        sell[1] = Math.max(sell[0], buy[0] + prices[1]);

        for (int i = 2; i < prices.length; i++) {
            buy[i] = Math.max(buy[i - 1] ,  sell[i - 2] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
        }

        return sell[prices.length - 1];


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{1,2,3,4}));
    }

}
