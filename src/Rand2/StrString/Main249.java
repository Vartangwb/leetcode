package StrString;

import java.util.*;

/**
 * Created by twb on 2017/7/1.
 */
public class Main249 {

    public List<List<String>> groupStrings(String[] strings) {

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        int len = strings.length;

        for(int i = 0; i < len; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j< strings[i].length();j++){
                sb.append((strings[i].charAt(j)-strings[i].charAt(j)+26)%26);
            }
            if(hm.containsKey(sb)){
                hm.get(sb.toString()).add(strings[i]);//put(sb.toString(), strings[i]);
            }else{
                List<String > ls = new ArrayList<>();
                ls.add(strings[i]);
                hm.put(sb.toString(), ls);
            }
        }
        for(String ss:hm.keySet()){
            res.add(hm.get(ss));
        }
        return res;
    }

    public static void main(String[] args) {
            System.out.println(("  30"));
    }

}
