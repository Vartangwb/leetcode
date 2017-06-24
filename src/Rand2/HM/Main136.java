package HM;

/**
 * Created by twb on 2017/6/19.
 */
public class Main136 {

    public static int singleNumber(int[] nums) {
        int len = nums.length;
        int res = 0;
        for(int i = 0;i<len;i++){
            res^=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,1,1,1}));
    }



}