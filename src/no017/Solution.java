package no017;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    String[] ss = {"", "", "abc", "def","ghi", "jkl", "mno", " pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {


        List<String> res = new ArrayList<>();
        helper(res, digits, 0, new StringBuilder());
        return res;
    }

    public void helper(List<String> ress, String digits, int index, StringBuilder res){
        if(index == digits.length()){
            ress.add(new String(res.toString()));
            return;
        }

            for(int j = 0; j < ss[digits.charAt(index) - '0'].length(); j++){
                res.append(ss[digits.charAt(index) - '0'].charAt(j));
                helper(ress, digits, index+1, res);
                res.deleteCharAt(res.length()-1);
            }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> res = solution.letterCombinations("23");
        for(String ss: res){
            System.out.println(ss);
        }
    }

}
