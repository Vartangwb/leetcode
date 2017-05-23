package no011;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left<right){
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left)*min);
            if(min == height[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1,2,3,4,5}));
    }

}
