package no398;


import java.util.Random;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }
    int nums[];
    Random random;
   public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
   }

    public int pick(int target) {
        int count = 0;
        int res = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=target){
                continue;
            }
            if(random.nextInt(++count)==0){
                res = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        Solution solution = new Solution(new int[]{1,2,3,3,3,3});
        System.out.println(solution.pick(3));
    }

}
