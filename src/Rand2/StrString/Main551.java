package StrString;

import java.util.Collections;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main551 {

    public static boolean checkRecord(String s) {
        int len = s.length();
        if(s.length()<2)
            return true;
        int late_num = 0;
        for(int i = 0;i<len-2;i++){
            if(s.charAt(i)=='A'){
                late_num++;
            }else if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                return false;
            }
        }
        if(s.charAt(len-1)=='A' )
            late_num++;
        if(s.charAt(len-2)=='A')
            late_num++;
        if(late_num>1)
            return false;
        return true;
    }
    public static void main(String[] args) {
            System.out.println(checkRecord("PAALLL"));
    }

}
