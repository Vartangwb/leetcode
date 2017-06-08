package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main035 {

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (right + left)/2;
            //System.out.println(mid);
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }
            //System.out.println(left);
        }
        return left;
    }
    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{7,7,7,9,10},7));
    }
}
