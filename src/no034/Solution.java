package no034;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                res[0] = mid;
                res[1] = mid;
                break;
            }else if(nums[mid]>target){
                right--;
            }else{
                left++;
            }
        }
        if(nums[mid]!=target)
            return res;
        int newL = 0;
        int newR = mid;
        while(newL<=newR){
            int newMid = (newL+newR)/2;
            if(nums[newMid] == target){
                newR = newMid-1;
            }else{
                newL = newMid+1;
            }
        }
        res[0] = newL;
        newL = mid;
        newR = nums.length - 1;
        while(newL<=newR){
            int newMid = (newL+newR)/2;
            if(nums[newMid] == target){
                newL = newMid+1;
            }else{
                newR = newMid-1;
            }
        }
        res[1] = newR;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ss[] = solution.searchRange(new int[]{1,2,3,3,3,3,4,5,6},3);
        System.out.println(ss[0]+" "+ss[1]);
    }
}
