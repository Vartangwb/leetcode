package Round1.no259;


import java.util.Arrays;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public int threeSumSmaller(int[] nums, int target) {
        int cnt = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int currNum = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(left<right){
                int sum = currNum + nums[left] + nums[right];
                if(sum>=target){
                    right -- ;
                }else{
                    cnt+=right-left;
                    left++;
                }
            }
        }
        return cnt;
    }



    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.threeSumSmaller(new int[]{1,2,3,4},7));
    }

}
