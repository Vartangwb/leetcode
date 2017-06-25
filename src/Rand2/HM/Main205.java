package HM;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/19.
 */
public class Main205 {

    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> hs_1 = new HashMap<Character, Character>();
        HashMap<Character, Character> hs_2 = new HashMap<Character, Character>();
        for(int i = 0;i<len;i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if(hs_1.containsKey(x)){
                if(hs_1.get(x)!=y)
                    return false;
            }
            if(hs_2.containsKey(y)){
                if(hs_2.get(y)!=x)
                    return false;
            }
            hs_1.put(x,y);
            hs_2.put(y,x);

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("title1","paper1"));;

    }



}