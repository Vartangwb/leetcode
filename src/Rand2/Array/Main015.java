package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main015 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = len-1;
            int target = -nums[i];
            while(j<k){

                if(nums[k]+nums[j]==target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                }else if(target>nums[k]+nums[j]){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
