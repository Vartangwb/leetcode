package Round1.no394;


import java.util.Stack;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public String decodeString(String s) {
        Stack<String> stc = new Stack<>();
        Stack<Integer> stc_num = new Stack<>();
        String str = "";
        int len = s.length();
        int i = 0;
        while(i<len){
            char c = s.charAt(i);
            if(c>='1' && c<='9'){
                int count = c - '0';
                i++;
                while(s.charAt(i)>=0 && s.charAt(i)<=9){
                    count = count*10+s.charAt(i)-'0';
                    i++;

                }
                stc_num.push(count);
            }else if(s.charAt(i) == '['){
                stc.push(str);
                i++;
                str = "";
            }else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder(stc.pop());
                int couuu = stc_num.pop();
                for(int ii = 0;ii < couuu; ii++) {
                    sb.append(str);
                }
                str = sb.toString();
                i++;
            }else {
                str+=s.charAt(i);
                i++;
            }
        }
        return str;
    }



    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.decodeString("2[abc]"));
    }

}
