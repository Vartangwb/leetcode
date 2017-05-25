package no047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> ls = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[]tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String tmpStr = String.valueOf(tmp);
            if(ls.containsKey(tmpStr)){
                ls.get(tmpStr).add(strs[i]);
            }else{
                ls.put(tmpStr, new ArrayList<>());
                ls.get(tmpStr).add(strs[i]);
            }
        }
        res.addAll(ls.values());
        return res;
    }

}
