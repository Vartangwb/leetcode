package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main055 {

    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i>max){
                return false;
            }
            max = Math.max(max, nums[i]+i);
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(canJump(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
