package Round1.no120;

import java.util.List;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
        int dp[][] = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        for(int i = 1;i<size;i++){
            dp[i][0] = triangle.get(i).get(0)+dp[i-1][0];
        }

        int max = dp[size-1][0];
        for(int i = 1;i<size;i++){
            for(int j = 1;j<triangle.get(i).size();j++) {
                if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + dp[i][j];

                }
                if (i == size - 1) {
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }

}
