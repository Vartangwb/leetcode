package no491;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ress= new HashSet<List<Integer>>();
        List<List<Integer>> res = new ArrayList<>();
        DFS(nums,ress, new ArrayList<>(), 0);
        res = new ArrayList<>(ress);
        return res;
    }
    public void DFS(int[] nums, Set<List<Integer>> ress, List<Integer> ls, int start){
        if(ls.size()>=2){
            ress.add(new ArrayList<>(ls));

        }

        for(int i = start;i<nums.length;i++){
            if(ls.size()==0){
                ls.add(nums[i]);
            }else{
                if(nums[i]<ls.get(ls.size() - 1)){
                    continue;
                }else{
                    ls.add(nums[i]);
                }
            }
            DFS(nums, ress, ls, i+1);
            ls.remove(ls.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ls = solution.findSubsequences(new int[]{3,6,7,7});
        for(List<Integer> ss:ls){
            for(Integer ii: ss){
                System.out.print(ii+ " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
