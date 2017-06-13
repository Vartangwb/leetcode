package Round1.no525;

import java.util.HashMap;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                nums[i] = -1;
        }
        int currSum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(hm.containsKey(currSum)){
                max = Math.max(i - hm.get(currSum), max);
            }else{
                hm.put(currSum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxLength(new int[]{1,0,0,1,0}));
    }

}
