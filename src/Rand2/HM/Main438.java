package HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/19.
 */
public class Main438 {

    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> ls = new ArrayList<>();
        int len = p.length();
        if(s == null || p == null || s.length() == 0 || p.length() == 0)
            return ls;
        int[] hm_p = new int[256];
        int[] hs_p = new int[256];
        for(int i = 0; i < len; i++){
            hm_p[p.charAt(i)]++;
        }
        for(int j = 0; j < s.length(); j++){
            hs_p[s.charAt(j)]++;
            if(j >= len){
                hs_p[s.charAt(j-len)]--;
            }
            if(Arrays.equals(hm_p, hs_p)){
                //System.out.println("123");
                ls.add(j - len + 1);
            }
        }
        return ls;
    }
    public static void main(String[] args) {

        System.out.println(findAnagrams("abab","ab"));
    }



}