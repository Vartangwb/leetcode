package Array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by twb on 2017/6/7.
 */
public class Main548 {
    public static boolean splitArray(int[] nums) {

        int len = nums.length;
        if(len<7)
            return false;
        int[] sums = new int[len];
        sums[0] = nums[0];
        for(int l = 1;l<len;l++){
            sums[l]=sums[l-1]+nums[l];
        }
        int i = 0,j=0,k=0;
        for(j = 3;j<len-3;j++){
            HashSet<Integer> hs = new HashSet<>();
            for(i = 1;i<j-1;i++){
                if(sums[i-1] == sums[j-1]-sums[i]){
                    hs.add(sums[i-1]);
                }
            }

            for(k= j+2;k<len-1;k++){
                if(sums[k-1]-sums[j] == sums[len-1] - sums[k]){
                    if(hs.contains(sums[len-1] - sums[k]))
                        return true;
                }
            }

        }
        return false;

    }
    public static void main(String[] args) {
        Main548 main = new Main548();
        System.out.println(splitArray(new int[]{1,1,1,1,1,1,1}));
    }

}
