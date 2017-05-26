package no033;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {
    public int search(int[] nums, int target) {

        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[left]<nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(nums[left]>nums[mid]){
                if(nums[mid]<target && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid - 1;
                }
            }else{
                left++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4,5,6,7,1,2,3},3));
    }

}
