package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main442 {

    public static List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < len;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                ls.add(Math.abs(nums[i]));
            }else{
                nums[Math.abs(nums[i]) - 1]*=-1;
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        Main442 main = new Main442();
        System.out.println(findDuplicates(new int[]{1,2,1,3,2}));
    }

}
