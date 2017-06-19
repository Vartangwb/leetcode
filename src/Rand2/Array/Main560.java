package Array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by twb on 2017/6/7.
 */
public class Main560 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        int res = 0;
        int currSum = 0;
        for(int i = 0;i<nums.length;i++){
            currSum+=nums[i];
            if(hm.containsKey(currSum-k)){
                res+=hm.get(currSum-k);
            }
            hm.put(currSum, hm.getOrDefault(currSum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Main560 main = new Main560();
        System.out.println(subarraySum(new int[]{1,1,1,1,1,1,1},2));
    }

}
