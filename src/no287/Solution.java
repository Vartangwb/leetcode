package no287;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast!=slow);
        int find = 0;
        while(find!=slow){
            find = nums[find];
            slow = nums[slow];
        }
        return find;
    }
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(new int[]{1,2,2,3}));
    }

}
