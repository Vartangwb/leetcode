package no075;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public void sortColors(int[] nums) {
        int len = nums.length;
        int i = 0;
        int left = 0;
        int right = len - 1;
        while(i<=right){
            if(nums[i] == 0){
                swap(nums, left,i);
                i++;
                left++;
            }else if(nums[i] == 2){
                swap(nums, i, right);
                //i++;
                right--;
            }else{
                i++;
            }
        }
    }
    public void swap(int[] nums, int left, int i){
        int tmp = nums[left];
        nums[left] = nums[i];
        nums[i] = tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]res = new int[]{1,0,0,1,2,2,0};
        solution.sortColors(res);
        for(int i:res){
            System.out.print(i+" ");

        }
    }

}
