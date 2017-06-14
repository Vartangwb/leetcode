package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main090 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        res.add(new ArrayList<>());
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int index){
        if(ls.size()!=0){
            res.add(new ArrayList<>(ls));
        }
        for(int i = index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])
                continue;
            ls.add(nums[i]);
            helper(res, ls, nums, i+1);
            ls.remove(ls.size()-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(subsetsWithDup(new int[]{2,2,1}));
    }
}
