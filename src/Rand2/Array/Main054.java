package Array;

import Utils.Utils;

/**
 * Created by twb on 2017/6/7.
 */
public class Main054 {

    public static int maxSubArray(int[] nums) {
        int maxRes = nums[0];
        int currSum = 0;
        for(int i = 0;i<nums.length;i++){
            if(currSum<0){
                currSum = nums[i];
            }else{
                currSum+=nums[i];
            }
            maxRes = Math.max(maxRes, currSum);
        }
        return maxRes;
    }
    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
