package no215;

import java.util.PriorityQueue;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int currNum = 0;
        for(int i = 0; i < nums.length; i++){
            priorityQueue.add(nums[i]);
            currNum++;
            if(currNum>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{1,2,3,4},3));
    }

}
