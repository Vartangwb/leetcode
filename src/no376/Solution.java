package no376;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    int wiggleMaxLength(int[] nums) {
        int dp[] = new int[nums.length];
        int down[] = new int[nums.length];
        dp[0] = 1;
        down[0] = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i] = down[i-1]+1;
                down[i] = down[i-1];
            }else if(nums[i]<nums[i-1]){
                down[i] = dp[i-1];
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1];
                down[i] = down[i-1];
            }
        }
        return Math.max(dp[nums.length-1],down[nums.length-1]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(new int[]{1,2,3,4}));
    }
}
