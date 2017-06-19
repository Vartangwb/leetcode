package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main611 {
    public static int triangleNumber(int[] A) {

        int res = 0;
        Arrays.sort(A);
        for(int i = A.length-1;i>=2;i--){
            int left = 0;
            int right = i-1;
            while(left<right){
                if(A[left]+A[right]>A[i]){
                    res+=right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Main611 main = new Main611();
        System.out.println(triangleNumber(new int[]{2,2,3,4}));
    }

}
