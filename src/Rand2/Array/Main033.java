package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main033 {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]>nums[left]){
                if(target>=nums[left] && target<nums[mid]){
                    right = mid-1;
                }else{
                    left=mid+1;
                }
            }else if(nums[mid]<nums[left]){
                if(target>nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else{
                    right=mid-1;
                }
            }else{
                left++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{7,8,9,10},7));
    }
}
