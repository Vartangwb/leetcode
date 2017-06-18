package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main280 {

    public static int wiggleSort(int[] nums) {
        // 先将数组排序
        Arrays.sort(nums);
        // 将数组中一对一对交换
        for(int i = 2; i < nums.length; i+=2){
            int tmp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = tmp;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main280 main = new Main280();
        System.out.println(wiggleSort(new int[]{2,1,3}));
    }

}
