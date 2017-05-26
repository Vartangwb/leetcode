package no040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, ll, new ArrayList<>(), target, 0,0);
        return ll;
    }

    public void helper(int[] candidates, List<List<Integer>> res, List<Integer> ls, int target, int currSum, int index){

        if(currSum == target){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(currSum>target){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            ls.add(candidates[i]);
            helper(candidates, res, ls, target, currSum + candidates[i], i+1);
            ls.remove(ls.size() - 1);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for(List<Integer> ls:solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5},8)){
            for(Integer ll: ls){
                System.out.print(ll+" ");
            }
            System.out.println(" ");
        };
    }

}
