package StrString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main017 {

    static String[] ss = {"", "", "abc", "def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        helper(res, 0, 0,  new StringBuilder(), digits);
        return res;
    }
    public static void helper(List<String> res, int index, int index2, StringBuilder sb, String digits){
        if(index == digits.length()){
            res.add(new String(sb.toString()));
            return ;
        }
        for(int i = 0; i < ss[digits.charAt(index)-'0'].length();i++){
            sb.append(ss[digits.charAt(index)-'0'].charAt(i));
            helper(res, index+1, 0,sb, digits );
            sb.deleteCharAt(sb.length()-1);
        }
    }
        public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

}
