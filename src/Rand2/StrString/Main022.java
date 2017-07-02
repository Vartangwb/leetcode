package StrString;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/1.
 */
public class Main022 {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateOneByOne("", list, n, n);
        return list;
    }
    public static void generateOneByOne(String sublist, List<String> list, int left, int right){
        if(left > right){
            return;
        }
        if(left > 0){
            generateOneByOne( sublist + "(" , list, left-1, right);
        }
        if(right > 0){
            generateOneByOne( sublist + ")" , list, left, right-1);
        }
        if(left == 0 && right == 0){
            list.add(sublist);
            return;
        }
    }
        public static void main(String[] args) {
        System.out.println(generateParenthesis(9));
    }

}
