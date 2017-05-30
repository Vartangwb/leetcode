package no324;

import java.util.Arrays;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    public void wiggleSort(int[] nums) {

        int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(temp);
        int large = temp.length / 2 + (temp.length % 2 == 0 ? -1 : 0);
        int small = temp.length - 1;
        for (int i = 0, j = 1; i < temp.length; i+=2, j+=2) {
            if(j < temp.length) nums[j] = temp[small--];
            nums[i] = temp[large--];
        }
    }
    void wiggleSort1(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) return;
        for (int i = 2; i < nums.length; i += 2) {
            swap(nums,i,i-1 );
        }
    }
    public void swap(int[] nums, int m,int n){
        int tmp = nums[m];
        nums[m] = nums[n];
        nums[n] = tmp;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.wiggleSort(new int[]{1,1,2,2,3,4,});
    }

}
