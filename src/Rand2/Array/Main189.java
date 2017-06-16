package Array;

import static Array.Main189.reverse;

/**
 * Created by twb on 2017/6/7.
 */
public class Main189 {

    public static void rotate(int[] nums, int k) {
        int len = nums.length - 1;
        k = k%(len+1);
        reverse(nums, 0, len - k);
        reverse(nums, len - k + 1, len);
        reverse(nums, 0 , len);
        //PrintLn(nums);
    }
    public static void reverse(int[] nums,int front,int end){
        while(front<end){
            int tmp = nums[front];
            nums[front] = nums[end];
            nums[end] = tmp;
            front++;
            end--;
        }
    }


        public static void main(String[] args) {

        rotate(new int[]{2,3,-1,4},3);
    }
}
