package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by twb on 2017/6/7.
 */
public class Main561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Main561 main = new Main561();
        System.out.println(arrayPairSum(new int[]{1,1,1,1,1,1,1}));
    }

}
