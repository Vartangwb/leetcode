package no031;

/**
 * Created by twb on 2017/5/28.
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-1;
        while(i>=0){
            if(nums[i]>=nums[i+1]){
                i--;
            }else{
                break;
            }
        }
        int j = len-1;
        if(i>=0) {
            while (j > i) {
                if (nums[j] <= nums[i]) {
                    j--;
                } else {
                    break;
                }
            }
            swap(nums, i,j);
        }
        reverse(nums, i+1,len-1);
    }private void swap(int[] nums, int i1, int i2){
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }
    public void reverse(int[] nums, int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}
