package Round1.no077;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), 1, n,k);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> ls, int start, int n,int k){
        //System.out.println(ls.size()+" "+start);
        if(ls.size() == k){
            res.add(new ArrayList<>(ls));
            //return;
        }
        for(int i = start;i<=n;i++){
            ls.add(i);
            /*
            for(int kk = 0;kk<ls.size();kk++){
                System.out.println(kk+" "+ls.get(kk));
            }
            */
            dfs(res, ls, i+1, n,k);
            ls.remove(ls.size() - 1);

/*
            for(int kk = 0;kk<ls.size();kk++){
                System.out.println(kk+" hehe"+ls.get(kk));
            }
            */
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ls = solution.combine(3,2);
        for(List<Integer> ss:ls){
            for(Integer ii: ss){
                System.out.print(ii+ " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
