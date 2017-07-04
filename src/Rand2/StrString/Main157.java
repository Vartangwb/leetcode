package StrString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main157 {


    public static boolean isValid(String s){
        if(s.length()<0 || s.length()>4 || Integer.parseInt(s)<0 || Integer.parseInt(s)>255 || (s.charAt(0)=='0' && s.length()>1))
            return false;
        return true;
    }
    //public static void main(String[] args) {
    //    System.out.println(restoreIpAddresses("12310"));
    //}

}
