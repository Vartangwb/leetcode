package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main209 {

    public static int minSubArrayLen(int s, int[] nums) {

        int left = 0;
        int right = 0;
        int currsum = 0;
        int min = Integer.MAX_VALUE;
        while(right<nums.length){

            currsum+=nums[right];
            right++;
            while(currsum>=s){
                min = Math.min(min, right-left);
                currsum-=nums[left];
                left++;
            }
        }
        return min;
    }

        public static void main(String[] args) {

            System.out.println(minSubArrayLen(7,new int[]{7,3,4}));
    }
}
