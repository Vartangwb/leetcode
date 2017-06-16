package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        String res1 = null;
        for(int i = 0; i < nums.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            int j = i+1;
            while(j<=nums.length){
                if(j<nums.length && nums[j] == nums[j-1]+1){
                    j++;
                }else{
                    if(j==i+1){
                        res.add(sb.toString());
                        res1 = sb.toString();
                    }else{
                        i=j-1;
                        res.add(sb.append("->").append(nums[i]).toString());
                        res1 = res.get(res.size()-1);
                    }
                    break;
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {

            System.out.println(summaryRanges(new int[]{1,2,4,5}));
    }
}
