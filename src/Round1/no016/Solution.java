package Round1.no016;

import java.util.Arrays;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int res = nums[0] + nums[1] + nums[len - 1];
        int left = 0;
        int right = len - 1;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            left = i + 1;
            right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (Math.abs(target - sum) < Math.abs((target - res)))
                    res = sum;
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    return res;
                }
            }

        }
        return res;
    }
}
