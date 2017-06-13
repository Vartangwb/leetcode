package Round1.no228;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String>  res = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            StringBuilder ss = new StringBuilder();
            ss.append(nums[i]);
            int j = i+1;
            while(j<=nums.length){
                if(j!= nums.length && nums[j] - nums[j-1] == 1){
                    j++;
                }else{
                    if(j==i+1){
                        res.add(ss.toString());
                    }else{
                        i = j-1;
                        res.add(ss.append("->").append(nums[i]).toString());

                    }
                    break;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (String s:solution.summaryRanges(new int[]{1,2,3,5,6,7,9})){
            System.out.println(s);
        }
    }
}
