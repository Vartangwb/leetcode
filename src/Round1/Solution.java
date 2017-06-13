package Round1.no386;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public List<Integer> lexicalOrder(int n) {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=1;i<=9;i++){
            dfs(n, i, ls);
        }
        return ls;
    }
    public void dfs(int n, int curr, List<Integer> ls){
        //if(curr > n)
        //    return;
        ls.add(curr);
        for(int i = 0; i <=9;i++){
            if(curr*10+i>n)
                return;
            dfs(n, curr*10+i, ls);
        }
    }



    public static void main(String[] args) {

        Solution solution = new Solution();
        List<Integer> ls  = solution.lexicalOrder(13);
        for(Integer ll:ls){
            System.out.println(ll);
        }
    }

}
