package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main034 {

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        int res[] = new int[2];
        res[0]=-1;
        res[1]=-1;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                res[0] = mid;
                res[1] = mid;
                break;
            }else if(nums[mid]>target){
                right--;
            }else{
                left = left+1;
            }
        }
        if(nums[mid]!=target)
            return res;
        int newL = mid;
        int newR = nums.length-1;
        while(newL<=newR){
            int midd = (newL+newR)/2;
            if(nums[midd]==target){
                newL = midd + 1;

            }else{
                newR = midd-1;
            }
        }
        res[1] = newR;
        newL = 0;
        newR=mid;
        while(newL<=newR){
            int newM=(newL+newR)/2;
            if(nums[newM]==target)
            {
                newR = newM-1;
            }
            else
            {
                newL = newM+1;
            }
        }
        res[0]=newL;
        return res;
    }
    public static void main(String[] args) {

        System.out.println(searchRange(new int[]{7,7,8,9,10},7)[1]);
    }
}
