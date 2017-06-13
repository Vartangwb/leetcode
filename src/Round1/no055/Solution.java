package Round1.no055;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        for(int i = 0;i<len;i++){
            if(i>max){return false;
            };
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{1,2,3,4,0,5}));
    }

}
