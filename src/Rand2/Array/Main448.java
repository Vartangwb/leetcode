package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val]*=-1;
            }
        }
        for(int i = 0;i<len;i++){
            if(nums[i]>0){
                ls.add(i+1);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        Main448 main = new Main448();
        System.out.println(findDisappearedNumbers(new int[]{1,2,1,3,2}));
    }

}
