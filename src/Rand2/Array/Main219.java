package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int len = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<len;i++){
            if(i>k){
                hm.remove(nums[i-k-1]);
            }

            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],1);
        }
        return false;

    }
    public static void main(String[] args) {

            System.out.println(containsNearbyDuplicate(new int[]{1,2,3,4,3},3));
    }
}
