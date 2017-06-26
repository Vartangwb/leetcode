package HM;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/19.
 */
public class Main409 {

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }
        int even = 0;
        int res = 0;
        int eee = -1;
        for(char c : hm.keySet()){
            if(hm.get(c)%2==0){
                res+=hm.get(c);
            }else{
                res+=hm.get(c)-1;
                eee = 1;
            }
        }
        if(eee==-1)
            even = 0;
        else{
            even = 1;
        }
        return res+even;
    }


    public static void main(String[] args) {

        System.out.println(longestPalindrome("abcd"));
    }



}