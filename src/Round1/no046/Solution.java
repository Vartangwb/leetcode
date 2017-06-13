package Round1.no046;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }
   public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        helper(res, new ArrayList<>(), nums, flag);
        return res;
   }
   public void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, boolean flag[]){
       if(ls.size() == nums.length){
           res.add(new ArrayList<>(ls));
       }
       for(int i = 0; i < nums.length; i++){
           if(flag[i] == true){continue;}
           flag[i] = true;
           ls.add(nums[i]);
           helper(res, ls, nums, flag);
           flag[i] = false;
           ls.remove(ls.size() - 1);
       }
   }



    public static void main(String[] args) {

        Solution solution = new Solution();
        for(List<Integer> ii: solution.permute(new int[]{1,2,3})){
            for(int jj: ii){
                System.out.print(jj+"  ");
            }
            System.out.println("..");
        }
    }

}
