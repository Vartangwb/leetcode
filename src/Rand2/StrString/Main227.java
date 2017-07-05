package StrString;

import java.util.Stack;

/**
 * Created by twb on 2017/7/1.
 */
public class Main227 {

    public static int calculate(String s) {
        s = s.replace(" ", "");
        int len = s.length();
        Stack<Integer> stc = new Stack<>();
        char flag = '+';
        int num = 0;
        System.out.println(s.length());
        for(int i = 0; i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                num = num*10+s.charAt(i)-'0';
            }
            if(!Character.isDigit(s.charAt(i)) || i == len-1){
                switch (flag){
                    case '+':
                        break;
                    case '-':
                        num = num*-1;
                        break;
                    case '*':
                        num = num*stc.peek();
                        stc.pop();
                        break;
                    case '/':
                        num = stc.peek()/num;
                        stc.pop();
                        break;
                    default:
                        break;
                }
                stc.push(num);
                num = 0;
                flag = s.charAt(i);
            }
        }

        while(!stc.isEmpty()){
            num+=stc.pop();
        }
        return num;
    }
        public static void main(String[] args) {
            System.out.println(calculate("  30"));
    }

}
