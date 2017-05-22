package no300;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = 1;
        for(int j = 1;j<n;j++){
            for(int ii = 0;ii<j;ii++){
                if(nums[j]>=nums[ii]){
                    dp[j] = Math.max(dp[j],dp[ii]);
                }
            }
            dp[j] += 1;
            max = Math.max(max, dp[j]);
        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{1,2,4,4,3,3,3,5}));
    }

}
