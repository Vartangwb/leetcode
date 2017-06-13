package Round1.no548;

import java.util.HashSet;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    boolean splitArray(int[] nums) {
        int len = nums.length;
        if(len<7)
            return false;
        int sums[] = new int[len];
        sums[0] = nums[0];
        for(int i = 1;i<len;i++){
            sums[i] = sums[i-1]+nums[i];
        }

        for(int j = 3;j<len-3;j++){

            HashSet<Integer> hs = new HashSet<>();
            for(int i = 1;i<j-1;i++){
                if(sums[i-1] == sums[j-1]-sums[i]){
                    hs.add(sums[i-1]);
                }
            }
            for(int k = j+2;k<len-1;k++){
                int sum1 = sums[k-1]-sums[j];
                int sum2 = sums[len-1] - sums[k];
                if(sum1==sum1 && hs.contains(sum1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.splitArray(new int[]{1,2,1,2,1,2,1}));
    }

}
