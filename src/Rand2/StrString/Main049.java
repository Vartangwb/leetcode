package StrString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main049 {

    public static List<List<String>> groupAnagrams(String[] strs) {
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
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"123","100"}));
    }

}
