package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main081 {

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid] == target)
                return true;
            //左半部分升序
            if(nums[mid]>nums[left]){
                if(nums[left]<=target && target<nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if(nums[mid]<nums[left]){
                if(nums[right]>=target && target>nums[mid]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }


            }else{
                if(nums[left] == target)
                    return true;
                left++;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(search(new int[]{2,2,3,1,1,1,},1));
    }
}
