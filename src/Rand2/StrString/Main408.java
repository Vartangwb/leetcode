package StrString;

import java.util.HashMap;

/**
 * Created by twb on 2017/7/1.
 */
public class Main408 {

    public static boolean validWordAbbreviation(String word, String abbr) {
        int len = 0;
        int i = 0, j = 0;

        while(i < word.length() && j < abbr.length()){
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
                continue;
            }
            if(abbr.charAt(j) <= '0' || abbr.charAt(j) > '9'){
                return false;
            }
            int start = j;
            while(j< abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9'){
                j++;
            }
            int num = Integer.valueOf(abbr.substring(start, j));
            i += num;
        }

        return i == word.length() && j == abbr.length();
    }
    public static void main(String[] args) {
            System.out.println(validWordAbbreviation("asdde","asw"));
    }

}
