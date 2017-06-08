package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/6/7.
 */
public class Main016 {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;

        int res = nums[0]+nums[1]+nums[len-1];
        for(int i = 0;i<len-2;i++){
            int left = i+1;
            int right = len-1;
            while(left<right){
                if(Math.abs(res - target)>Math.abs(target - nums[i]+nums[left]+nums[right])){
                    res = nums[i]+nums[left]+nums[right];
                }
                if(nums[i]+nums[left]+nums[right]>target){
                    right--;
                }else if(nums[i]+nums[left]+nums[right]<target){
                    left++;
                }else{
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
