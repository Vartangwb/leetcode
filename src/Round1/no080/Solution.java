package Round1.no080;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        int curr = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]!=nums[curr-2]){
                nums[curr++] = nums[i];
            }
        }return
                curr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,1,2,3}));
    }
}
