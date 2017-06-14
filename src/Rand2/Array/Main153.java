package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main153 {

    public static int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else if (nums[mid] > nums[r]){
                l = mid + 1;
            } else {
                r--;  //nums[mid]=nums[r] no idea, but we can eliminate nums[r];
            }
        }
        return nums[l];
    }

    int findMin1(int[] nums) {
        int left = 0,  right = nums.length - 1;
        while(left < right) {
            if(nums[left] < nums[right])
                return nums[left];

            int mid = (left + right)/2;
            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }

        return nums[left];
    }


        public static void main(String[] args) {

        System.out.println(findMin(new int[]{2,3,-1,4}));
    }
}
