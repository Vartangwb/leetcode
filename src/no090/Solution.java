package no090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> ls = new ArrayList<Integer>();
        arr.add(ls);
        Arrays.sort(nums);
        helper(arr,ls,nums,0);
        return arr;
    }
    public void helper(List<List<Integer>> arr, List<Integer> ls, int[] nums, int start){
        if(ls.size()>0){
            arr.add(new ArrayList<Integer>(ls));
        }
        for(int i=start;i<nums.length;i++){
            if(i!=start && nums[i]==nums[i-1])
                continue;
            ls.add(nums[i]);
            helper(arr,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    }




}
