package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main075 {

    public static void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int i = 0;
        for(;i<=right;){
            if(nums[i]==0){
                swap(nums, i,left);
                i++;
                left++;
            }else if(nums[i]==2){
                swap(nums, i, right);
                right--;
            }else{
                i++;
            }
        }

    }
    public static void swap(int[] nums, int i, int j){

        int tmp = nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;

    }
    public static void main(String[] args) {
        sortColors(new int[]{2,1,0});
        }
}
