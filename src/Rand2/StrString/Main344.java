package StrString;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main344 {

    public static String reverseString(String s) {
        char [] res = new char[s.length()];
        int index = 0;
        int i=s.length()-1;
        for(;i>=0;i--){
            res[index] = s.charAt(i);
            index++;
        }
        return new String(res);
    }
    public static void main(String[] args) {
            System.out.println(reverseString("asd"));
    }

}
