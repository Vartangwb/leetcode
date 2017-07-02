package StrString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main028 {

    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(haystack.equals(needle))
            return 0;
        if(len2>len1)
            return -1;
        for(int i =0;i<=len1-len2;i++){
            if(haystack.substring(i, i+len2).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("abcd", "cd"));
    }

}
