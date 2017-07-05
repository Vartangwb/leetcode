package StrString;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static StrString.Main383.canConstruct;

/**
 * Created by twb on 2017/7/1.
 */
public class Main385 {

    public static NestedInteger deserialize(String s) {
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        String tokenNum = "";
        for(int i = 0; i<s.length();i++){
            char tmp = s.charAt(i);
            switch (tmp){
                case '[':
                    stack.push(new NestedInteger());
                    break;
                case ',':
                    if(!tokenNum.equals("")){
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));
                        tokenNum = "";
                    }
                    break;
                case ']':
                    if(!tokenNum.equals("")){
                        stack.peek().add(new NestedInteger(Integer.parseInt(tokenNum)));
                    }
                    NestedInteger ni = stack.pop();
                    tokenNum = "";
                    if(!stack.isEmpty()){
                        stack.peek().add(ni);
                    }else{
                        return ni;
                    }
                    break;
                default:
                    tokenNum+=tmp;
            }
        }
        if (!tokenNum.equals(""))//特殊case: 如果字符串只包含数字的情况
            return new NestedInteger(Integer.parseInt(tokenNum));
        return null;
    }
    public static void main(String[] args) {
            System.out.println(deserialize("[123,[456]]"));
    }

}
 class NestedInteger {
      // Constructor initializes an empty nested list.

     public NestedInteger(){};
              // Constructor initializes a single integer.
     public NestedInteger(int value){};

              // @return true if this NestedInteger holds a single integer, rather than a nested list.
             public boolean isInteger(){return false;};

              // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger(){return 1;};

           // Set this NestedInteger to hold a single integer.
              public void setInteger(int value){};

             // Set this NestedInteger to hold a nested list and adds a nested integer to it.
              public void add(NestedInteger ni){};

              // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return null if this NestedInteger holds a single integer
              public List<NestedInteger> getList(){return null;};
  }