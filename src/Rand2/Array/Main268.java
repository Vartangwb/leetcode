package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main268 {

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i]^(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Main268 main = new Main268();
        System.out.println(missingNumber(new int[]{2, 0, 1, 3}));
    }

}
