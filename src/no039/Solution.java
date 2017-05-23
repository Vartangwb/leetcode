package no039;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), target, candidates, 0, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> ls, int target, int candidates[], int start, int currSum){
        if(currSum == target){
            res.add(new ArrayList<>(ls));
            return;
        }else if(currSum>target){
            return;
        }
        for(int i = start;i<candidates.length;i++){
            ls.add(candidates[i]);
            dfs(res, ls, target, candidates, i, currSum + candidates[i]);
            ls.remove(ls.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> res = solution.combinationSum(new int[]{2,3,6},7);
        for(List<Integer> ll:res){
            for(Integer uu:ll){
                System.out.print(uu+" ");
            }
            System.out.println(" ");
        }
    }
}
