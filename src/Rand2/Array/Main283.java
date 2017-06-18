package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main283 {

    public static int solve(int[] nums) {

        int currLen = 0;

        for(int i = 0; i < nums.length; i+=1){
            if(nums[i]!=0){
                nums[currLen++] = nums[i];
            }
        }
        for(;currLen<nums.length;currLen++){
            nums[currLen] = 0;
            currLen++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main283 main = new Main283();
        System.out.println(solve(new int[]{2,1,3}));
    }

}
