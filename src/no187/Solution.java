package no187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ls = new ArrayList<>();
        if(s.length()<10)
            return ls;
        int mask = 0x7ffffff;
        int i=0;
        int curr = 0;
        while(i<9){
            curr = curr<<3 | (s.charAt(i) & 0x7);
            i++;
        }
        Map<Integer,Integer> map = new HashMap<>();
        while(i<s.length()){
            curr = (((curr& mask) << 3)) | (s.charAt(i) & 0x7);
            if(map.containsKey(curr)==false){
                map.put(curr,1);
            }else{
                if(map.get(curr)==1)
                    ls.add(s.substring(i-9,i+1));
                int num = map.get(curr)+1;
                map.put(curr,num);

            }
            i++;
        }
        return ls;
    }

}
