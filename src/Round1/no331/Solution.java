package Round1.no331;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public boolean isValidSerialization(String preorder) {

        String[] strs = preorder.split(",");
        List<String> ls = new ArrayList<>();
        for(String s:strs){
            ls.add(s);
            while(ls.size()>=3 && ls.get(ls.size()-1).equals("#") && ls.get(ls.size()-2).equals("#")
                    && ls.get(ls.size()-3).equals("#")==false){
                ls.remove(ls.size()-1);
                ls.remove(ls.size()-1);
                ls.remove(ls.size()-1);
                ls.add("#");
            }
        }
        if(ls.size() == 1 && ls.get(0).equals("#"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidSerialization("1,#,#"));
    }
}
