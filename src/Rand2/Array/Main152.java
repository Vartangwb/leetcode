package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main152 {

    public static int maxProduct(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        if (A.length == 1)
            return A[0];

        int max_value = A[0];
        int min_value = A[0];
        int max_res = A[0];
        for(int i = 1;i<A.length;i++){
            int tmp = max_value;
            max_value = Math.max(Math.max(max_value*A[i], A[i]),min_value*A[i]);
            min_value = Math.min(Math.min(min_value*A[i],A[i]),tmp*A[i]);
            max_res = Math.max(max_res, max_value);
        }
        return max_res;
    }


        public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{2,3,-1,4}));
    }
}
