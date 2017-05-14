package no360;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    //方法：根据a、b的符号决定函数增减特性处理。
        public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
            int[] f = new int[nums.length];
            if (a>0) {
                for(int i=0, j=nums.length-1, k=f.length-1; k>=0; k--) {
                    int fi = nums[i] * nums[i] * a + nums[i] * b + c;
                    int fj = nums[j] * nums[j] * a + nums[j] * b + c;
                    if (fi>=fj) {
                        f[k] = fi;
                        i++;
                    } else {
                        f[k] = fj;
                        j--;
                    }
                }
            } else if (a<0) {
                for(int i=0, j=nums.length-1, k=0; k<f.length; k++) {
                    int fi = nums[i] * nums[i] * a + nums[i] * b + c;
                    int fj = nums[j] * nums[j] * a + nums[j] * b + c;
                    if (fi<=fj) {
                        f[k] = fi;
                        i++;
                    } else {
                        f[k] = fj;
                        j--;
                    }
                }
            } else if (b>0) {
                for(int i=0; i<f.length; i++) {
                    f[i] = nums[i] * b + c;
                }
            } else if (b<0) {
                for(int i=0, j=f.length-1; j<f.length; i--) {
                    f[i] = nums[j] * b + c;
                }
            } else {
                // b==0
                for(int i=0; i<f.length; i++) f[i] = c;
            }
            return f;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortTransformedArray(new int[]{1,2,3,4},1,1,1);
    }
}
