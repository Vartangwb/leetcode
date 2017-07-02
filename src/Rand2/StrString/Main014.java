package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main014 {

    static String longestCommonPrefix(String[] strs) {
        if(strs.length<=0)
            return "";
        int maxlen = strs[0].length();
        int flag = 0;
        for(int i = 1;i < strs.length;i++){
            if(maxlen>strs[i].length()){
                maxlen = strs[i].length();
                flag = i;
            }
        }
        for(int i =0; i < strs.length; i++){
            if(i == flag)
                continue;
            for(int j = 0;j<maxlen;j++){
                if(strs[flag].charAt(j)!=strs[i].charAt(j)){
                    maxlen = j;
                    break;
                }
            }
        }
        return strs[flag].substring(0,maxlen);
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(null));
    }

}
