package Array;

import sun.nio.cs.ext.MacHebrew;

import static Utils.Utils.printArr;

/**
 * Created by twb on 2017/6/7.
 */
public class Main414 {

    public static int thirdMax(int[] nums) {

        Integer num1 = null;
        Integer num2 = null;
        Integer num3 = null;
        int len = nums.length;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0], nums[1]);
        for(int i = 0;i<len;i++){
            Integer ii = nums[i];

            if(ii.equals(num1) || ii.equals(num2) || ii.equals(num3)){
                continue;
            }
            if(num1 == null || nums[i]>num1){
                num1 = nums[i];
            }else if(num2 == null || nums[i]>num2){
                num2 = nums[i];
            }else{
                num3 = nums[i];
            }
        }
        return num3==null?num1:num3;
    }
        public static void main(String[] args) {
        Main414 main = new Main414();
            System.out.println(thirdMax(new int[]{1,2,1,1,3}));
    }

}
