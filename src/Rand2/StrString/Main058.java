package StrString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main058 {

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int i = 0;
        int currLen = 0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                currLen = 0;
            }else{
                currLen++;
            }
            i++;
        }
        return currLen;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("123 100"));
    }

}
