package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main026 {
    public static int removeDuplicates(int[] nums) {
        int curr = 0;
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[curr]!=nums[i]){
                nums[++curr] = nums[i];
            }
        }
        return curr+1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
