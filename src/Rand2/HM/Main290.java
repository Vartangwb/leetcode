package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main290 {

    public static boolean wordPattern(String pattern, String str) {
        String[] arr= str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashMap<String,Character> map1 = new HashMap<String,Character>();
        if(arr.length!= pattern.length())
            return false;
        for(int i=0;i<arr.length;i++){
            String ss = arr[i];
            char c = pattern.charAt(i);
            if(map1.containsKey(ss)){
                if(map1.get(ss)!=c)
                    return false;
            }
            if(map.containsKey(c)){
                if(map.get(c).equals(ss)==false)
                    return false;
            }
            map.put(c,ss);
            map1.put(ss,c);
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(wordPattern("",""));;

    }



}