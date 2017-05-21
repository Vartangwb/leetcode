package no078;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/21.
 */
public class Solution {


        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> ls = new ArrayList<Integer>();
            res.add(new ArrayList<Integer>(ls));
            helper(res,ls,0,nums);
            return res;
        }
        public void helper(List<List<Integer>> res, List<Integer> ls, int start,int[] nums){
            if(ls.size()>0){
                res.add(new ArrayList<Integer>(ls));
            }
            for(int i=start;i<nums.length;i++){
                ls.add(nums[i]);
                helper(res,ls,i+1,nums);
                ls.remove(ls.size()-1);
            }
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subsets(new int[]{1,2,3});

    }
}
