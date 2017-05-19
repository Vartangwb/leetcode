package no249;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/5/19.
 */
public class Solution {

    public List<List<String>> groupStrings(String[] strings) {

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        int len = strings.length;

        for(int i = 0; i < len; i++ ){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < strings[i].length(); j++){
                sb.append((strings[i].charAt(j) - strings[i].charAt(0) + 26) % 26);
                sb.append(" ");
            }

            String tmp = sb.toString();
            if(hm.containsKey(tmp)){
                hm.get(tmp).add(strings[i]);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(strings[i]);
                hm.put(tmp, ls);
            }

        }

        for(String ss : hm.keySet()){
            res.add(hm.get(ss));
        }
        return res;
    }
}
