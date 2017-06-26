package HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/6/19.
 */
public class Main525 {

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        int currSum = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            currSum+=nums[i];
            if(hm.containsKey(currSum)){
                max = Math.max(max, i-hm.get(currSum)+1);
            }else{
                hm.put(currSum, i+1);
            }
        }
        return max;
    }

    public static void main(String[] args) {


        System.out.println(findMaxLength(new int[]{1,0,1,0}));
    }
}



