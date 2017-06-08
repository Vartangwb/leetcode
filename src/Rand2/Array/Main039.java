package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main039 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, target, res, new ArrayList<>(), 0, 0);
        return res;

    }

    public static void helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> ls, int index, int sum){

        if(sum == target){
            res.add(new ArrayList<>(ls));
        }
        if(sum>target){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if(i!=0 && candidates[i]==candidates[i-1])
                continue;
            ls.add(candidates[i]);
            helper(candidates, target, res, ls, i,sum+candidates[i]);
            ls.remove(ls.size()-1);
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper2(candidates, target, res, new ArrayList<>(), 0, 0);
        return res;
    }

    public static void helper2(int[] candidates, int target, List<List<Integer>> res, List<Integer> ls, int index, int sum){

        if(sum == target){
            res.add(new ArrayList<>(ls));
        }
        if(sum>target){
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])
                continue;
            ls.add(candidates[i]);
            helper2(candidates, target, res, ls, i+1, sum+candidates[i]);
            ls.remove(ls.size()-1);
        }

    }


    public static void main(String[] args) {

        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5},8));
    }
}
