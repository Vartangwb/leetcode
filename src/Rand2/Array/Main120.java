package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main120 {

    public static int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
        int dp[][] = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<size;i++){
            for(int j = 0;j<triangle.get(i).size();j++)
            {
                if(j==0){
                    dp[i][0] = dp[i-1][0]+triangle.get(i).get(0);
                }
                if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) +  triangle.get(i).get(j);

                }
                if (i == size - 1) {
                    max = Math.min(max, dp[i][j]);
                }
            }
        }
        return max;
    }
    public static int minimumTotal1(List<List<Integer>> triangle) {

        int size = triangle.size();
        int dp[][] = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1;i<size;i++){
            dp[i][0] = dp[i-1][0]+triangle.get(i).get(0);
        }

        int max = dp[size-1][0];
        for(int i = 1;i<size;i++){
            for(int j = 1;j<triangle.get(i).size();j++)
            {
                if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) +  triangle.get(i).get(j);

                }
                if (i == size - 1) {
                    max = Math.min(max, dp[i][j]);
                }
            }
        }
        return max;
    }

        public static void main(String[] args) {

        System.out.println(minimumTotal(null));
    }
}
