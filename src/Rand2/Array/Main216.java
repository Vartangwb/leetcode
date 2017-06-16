package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main216 {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ls = new ArrayList<>();
        helper(ls, new ArrayList<>(),k, 1, 0, n);
        return ls;
    }
    public static void helper(List<List<Integer>> res, List<Integer> ls , int k, int currk, int currSum, int n){
        if(k+1==currk){
            if(currSum== n)
                res.add(new ArrayList<>(ls));
        }else if(currk>k || currSum>n){
            return;
        }

        for(int i = currk;i<=9;i++){
            ls.add(i);
            helper(res, ls, k, currk+1, currSum+i, n);
            ls.remove(ls.size()-1);
        }
    }

    public static void main(String[] args) {

            System.out.println(combinationSum3(2,4));
    }
}
