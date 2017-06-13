package Round1.no131;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        if(s==null || s.equals(""))
            return res;
        helper(res, new ArrayList<>(),s);
        return res;

    }

    public boolean isPara(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void helper(List<List<String>> res, List<String> ls, String s){
        if(s.equals("")){
            res.add(new ArrayList<>(ls));
        }
        for(int i = 1;i<=s.length();i++){
            String ss = s.substring(0,i);
            if(isPara(ss)){
                ls.add(ss);
                helper(res, ls, s.substring(i));
                ls.remove(ls.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for(List<String> ls:solution.partition("aab")){
            for(String ll: ls){
                System.out.print(ll+" ");
            }
            System.out.println(" ");
        }
    }
}
