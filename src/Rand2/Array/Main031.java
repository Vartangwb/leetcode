package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main031 {
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len<2){
            return;
        }
        int i = len-2;
        while(i>=0){
            if(nums[i]>=nums[i+1]){
                i--;
            }else{
                break;
            }
        }
        int j = len-1;
        if(i>=0){
            while(j>i){
                if(nums[j]<=nums[i]){
                    j--;
                }else{
                    break;
                }
            }
            swap(nums,i,j);
        }
        reverse(nums, i+1, len-1);
    }
    private static void swap(int[] nums, int i1, int i2){
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }
    public static void reverse(int[] nums, int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,2,2,3};
        nextPermutation(nums);
    }
}
