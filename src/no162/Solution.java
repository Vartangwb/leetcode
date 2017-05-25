package no162;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public int findPeakElement(int[] nums) {
          int len = nums.length;

        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(left == right)
                return left;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }

        }
        return left;
    }

}
