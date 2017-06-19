package Array;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/7.
 */
public class Main532 {
    public static int findPairs(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k < 0) return 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sss = 0;
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        if(k==0){
            for(int kk:hm.keySet()){
                if(hm.get(kk)>=2){
                    sss++;
                }
            }
        }else{
            for(int kk:hm.keySet()){
                if(hm.containsKey(kk-k)){
                    sss++;
                }
            }
        }
        return sss;
    }
    public static void main(String[] args) {
        Main532 main = new Main532();
        System.out.println(findPairs(new int[]{1,2,3,4},1));
    }

}
