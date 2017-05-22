package no334;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public boolean increasingTriplet(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int minVal2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= minVal){
                minVal = nums[i];
            }else if(nums[i] <= minVal2){
                minVal2 = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        Solution solution = new Solution();

        System.out.print(solution.increasingTriplet(new int[]{1,2,3}));
    }

}
