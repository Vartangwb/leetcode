package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main027 {
    public static int removeElement(int[] nums, int val) {
        int curr = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[curr++] = nums[i];
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
