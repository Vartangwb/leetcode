package no022;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    List<String> ls = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {

        helper("",n,n);
        return ls;

    }

    public void helper(String str,int left,int right){
        if(left==0 && right==0){
            ls.add(str);
        }
        if(right<left)
            return;
        if(left>0){
            helper(str+'(',left-1,right);

        }
        if(right>0){
            helper(str+')',left,right-1);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        for(String sss:solution.generateParenthesis(3)){
            System.out.println(sss);
        }

    }

}
