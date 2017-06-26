package HM;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twb on 2017/6/19.
 */
public class Main389 {

    public static char findTheDifference(String s, String t) {
        String new1 = s + t;
        int res = 0;
        for(int i = 0;i<new1.length();i++){
            res^=new1.charAt(i);
        }
        return (char)res;
    }


    public static void main(String[] args) {

        System.out.println(findTheDifference("abc", "abcd"));
    }



}