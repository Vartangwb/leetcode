package Array;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/7.
 */
public class Main001 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(target - nums[i])){
                res[0] = hm.get(target - nums[i]);
                res[1] = i;
                return res;
            }else{
                hm.put(nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Main001 main = new Main001();
        main.twoSum(new int[]{2,7,11,15},9);
    }

}
