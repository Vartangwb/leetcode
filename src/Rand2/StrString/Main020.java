package StrString;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/1.
 */
public class Main020 {

    public static boolean isValid(String s){

        if(s.length()<=0){
            return true;
        }
        Stack<Character> stc = new Stack<>();
        int len = s.length();
        for(int i = 0; i<len;i++){
            char ss = s.charAt(i);
            if(ss=='(' || ss == '{' || ss == '['){
                stc.push(ss);
            }else{
                char tmp = stc.pop();
                if(ss=='}' && tmp=='{' || ss==')' && tmp=='(' || ss==']' && tmp=='['){

                }else{
                    return false;
                }
            }
        }
        return stc.isEmpty();
    }
        public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }

}
