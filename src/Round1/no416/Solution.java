package Round1.no416;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum += nums[i];
        }
        if(sum%2==1)
            return false;
        sum = sum/2;
        boolean dp[][] = new boolean[len+1][sum + 1];

        for(int i = 0; i <= len; i++){
            dp[i][0] =  true;
        }
        for(int i = 1; i <= sum; i++){
            dp[0][i] = false;
        }
        for(int i = 1;i<=len;i++){
            for(int j = 1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if (j >= nums[i-1]) {
                    dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
                }
            }
        }
        return dp[len][sum];
    }

    public boolean canPartition_(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum += nums[i];
        }
        if(sum%2==1)
            return false;
        sum = sum/2;

        boolean dp[][] = new boolean[2][sum + 1];

        dp[0][0] = true;
        dp[1][0] = true;

        for(int i = 1;i<=len;i++){

            int pre = (i+1)&1;
            int now = i&1;
            for(int j = 0;j<=sum;j++){
                dp[now][j] = dp[pre][j];
            }
            //dp[now][j] = dp[i-1][j];
            for(int j = 1;j<=sum;j++){
                //dp[now][j] = dp[pre][j];
                if (j >= nums[i-1]) {
                    dp[now][j] = (dp[now][j] || dp[pre][j-nums[i-1]]);
                }
            }
        }
        return dp[len&1][sum];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canPartition_(new int[]{1,5,5,11}));
    }

}
