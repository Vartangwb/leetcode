package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int maxCount = Integer.MIN_VALUE;
        int currCount = 0;
        for(int i = 0;i<len;i++){

            if(nums[i] == 0){
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }else{
                currCount++;
            }
        }
        maxCount = Math.max(maxCount, currCount);
        return maxCount;

    }
    public static void main(String[] args) {
        Main485 main = new Main485();
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

}
