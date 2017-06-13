package Round1.no241;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<>();
        int len = input.length();
        for(int i = 0; i < len; i++){
            char c = input.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                List<Integer> left = diffWaysToCompute(input.substring(0 , i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1 , input.length()));

                for(int lef : left){
                    for(int rig :right){
                        System.out.println("left"+left.size());
                        System.out.println("right"+right.size());
                        if(c == '+'){
                            res.add(lef+rig);
                        }else if(c == '*'){
                            res.add(lef*rig);

                        }else if(c == '-'){
                            res.add(lef-rig);
                        }
                    }
                }
            }
        }
        if(res.size() == 0)
            res.add(Integer.valueOf(input));
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.diffWaysToCompute("1+2+3*4");

    }

}
