package Round1.no247;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/5/21.
 */
public class Solution {



    List<String> findStrobogrammatic(int n) {
        if(n <= 0) return new ArrayList<>();
        DFS(n, "");
        return result;
    }

    List<String> result = new ArrayList<>();
    List<String> same = new ArrayList<>(Arrays.asList("0", "1", "8"));
    static HashMap<Character,Character> two = new HashMap<>();
    static {
        two.put('0', '0');
        two.put('1', '1');
        two.put('6', '9');
        two.put('9', '6');
        two.put('8', '8');
    }
    public void DFS(int n, String str){
        if(n == 0) {
            result.add(str);
            return;
        }
        if(n%2==1){
            for(String ss:same){
                DFS(n-1, ss);
            }
        }
        if(n%2==1)
            return;
        for(Character cc: two.keySet()){

            if(n==2 && cc=='0'){
                continue;
            }
            DFS(n-2, cc+str+two.get(cc));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for(String ss:solution.findStrobogrammatic(2)){
            System.out.println(ss);
        }
    }

}
