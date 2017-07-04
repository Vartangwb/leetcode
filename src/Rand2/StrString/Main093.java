package StrString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main093 {

    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        for(int i = 1;i<len-2;i++){
            for(int j = i+1;j<len-1;j++){
                for(int k = j+1;k<len;k++){
                    String str1 = s.substring(0, i);
                    String str2 = s.substring(i, j);
                    String str3 = s.substring(j, k);
                    String str4 = s.substring(k,len);
                    if(isValid(str1) && isValid(str2) && isValid(str3) && isValid(str4)){
                        res.add(str1+'.'+str2+'.'+str3+'.'+str4);
                    }
                }
            }
        }
        return res;

    }
    public static boolean isValid(String s){
        if(s.length()<0 || s.length()>4 || Integer.parseInt(s)<0 || Integer.parseInt(s)>255 || (s.charAt(0)=='0' && s.length()>1))
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("12310"));
    }

}
