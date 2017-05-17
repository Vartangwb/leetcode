package no377;

/**
 * Created by twb on 2017/5/17.
 */
public class Solution {
    int combinationSum4(int[] nums, int target) {

        int len = nums.length;
        int dp[] = new int[target+1];
        dp[0] = 1;
        for(int i = 1;i <= target; i++){
            for(int num:nums){
                if(num<=i){
                    dp[i] = dp[i - num] + dp[i];
                }
            }
            /*
            for(int ii = 0;ii<=target;ii++){
                System.out.print(" "+dp[ii]);
            }
            System.out.println( " ");
            */
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum4(new int[]{1,2,3,4},4));
    }
}
