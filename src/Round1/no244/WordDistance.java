package Round1.no244;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/5/23.
 */
public class WordDistance {

    HashMap<String, List<Integer>> hm = new HashMap<>();
    public WordDistance(String[] words){

        for(int i = 0; i < words.length; i++){
            if(hm.containsKey(words[i]) == false){
                hm.put(words[i], new ArrayList<>());
                hm.get(words[i]).add(i);
            }else{
                hm.get(words[i]).add(i);
            }
        }

    }

    int shortest(String word1, String word2){
        List<Integer> ls = hm.get(word1);
        List<Integer> ls2 = hm.get(word2);
        int m = ls.size();
        int n = ls.size();
        int res = Integer.MAX_VALUE;
        int i = 0,j=0;
        while(i<m && j<n){
            res = Math.min(res, Math.abs(ls.get(i)-ls.get(j)));
            if(ls.get(i)>ls.get(j)){
                j++;
            }else{
                i++;
            }
        }
        return res;
    }
}
