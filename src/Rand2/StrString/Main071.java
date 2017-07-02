package StrString;

import java.util.Stack;

/**
 * Created by twb on 2017/7/1.
 */
public class Main071 {

    public static String simplifyPath(String path) {

        if(path==null || path.length()==0)
            return path;
        String[] s = path.split("/");
        Stack<String> stc = new Stack<>();
        Stack<String> stc1 = new Stack<>();
        for(int i=0;i<s.length;i++){
            if(s[i].equals(".") || s[i].equals(""))
                continue;
            if(s[i].equals("..")){
                if(stc.isEmpty()==false){
                    stc.pop();
                }
            }else{
                stc.push(s[i]);
            }
        }
        while(stc.isEmpty()==false){
            stc1.push(stc.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(stc1.isEmpty()==false){
            sb.append("/");
            sb.append(stc1.pop());

        }
        if(sb.length()==0)
            sb.append("/");
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(simplifyPath("/123/100//"));
    }

}
