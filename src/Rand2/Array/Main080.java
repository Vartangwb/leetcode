package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main080 {

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        if(len<=2)
            return len;
        int curr = 2;
        for(int i = 2;i<len;i++){
            if(nums[i]!=nums[curr-2]){
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
