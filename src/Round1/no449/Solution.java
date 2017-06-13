package Round1.no449;


import java.util.HashMap;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }

    public int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length; i++){
            currSum+=nums[i];
            if(hm.containsKey(currSum - k)){
                max = Math.max(max, i - hm.get(currSum - k));
            }
            if(!hm.containsKey(currSum)){
                hm.put(currSum, i);
            }
        }
        if(max == Integer.MIN_VALUE)
            return 0;
        return max;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.maxSubArrayLen(new int[]{1,2,3},1));
    }

}
