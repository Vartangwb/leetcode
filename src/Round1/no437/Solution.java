package Round1.no437;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public boolean makesquare(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int num: nums){
            sum += num;
        }

        if(sum%4 != 0)
            return false;
        int sums[] = new int[4];
        return dfs(nums, sums, sum/4, 0, len);
    }
    public boolean dfs(int[] nums, int[] sums, int target, int index,int len){
        if(index == len){
            if(sums[0] == target && sums[1] == target && sums[2] == target){
                return true;
            }
        }

        for(int i = 0; i < 4; i++){
            if(sums[i]+nums[index]>target) {
                //System.out.println("jump"+(sums[i]+nums[index]));
                continue;

            }
                sums[i]+=nums[index];
            //System.out.println("add"+sums[i]);
            if(dfs(nums, sums, target, index+1, len))
                return true;
            sums[i]-=nums[index];
            //System.out.println("sub"+sums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.makesquare(new int[]{1,2,3,2}));
    }
}
