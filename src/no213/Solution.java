package no213;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public int rob(int[] nums) {
        int left = 0;
        int right = nums.length;
        if(right==1){
            return nums[0];
        }
        return Math.max(rob(nums,0,right-2),rob(nums,1,right-1));
    }
    public int rob(int[] nums,int left,int right){
        if(right<left){
            return 0;
        }
        if(left==right){
            return nums[left];
        }
        int dp[] = new int[right+1];
        dp[left] = nums[left];
        dp[left+1] = Math.max(nums[left+1],dp[left]);
        for(int i=left+2;i<=right;i++){
            /*
            for(int j=left;j<i-1;j++){

                if(dp[j]+nums[i]>dp[i]){
                    dp[i] = dp[j]+nums[i];
                }


            }*/
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            //dp[i] = Math.max(dp[i-1],dp[i]);
        }
        return dp[right];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{1,2,3,4,5}));
    }

}
