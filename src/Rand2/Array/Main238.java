package Array;

import Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main238 {

    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = 1;
        for(int i = 1;i<nums.length;i++){
            res[i] = nums[i-1]*res[i-1];

        }
        int right = 1;
        for(int ii=nums.length-1;ii>=0;ii--){
            res[ii] *=right;
            right*=nums[ii];
        }
        return res;
    }

    public static void main(String[] args) {
        Main238 main = new Main238();
        Utils.printArr(main.productExceptSelf(new int[]{1,2,3,4}));
    }

}
