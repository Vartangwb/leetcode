package DP;

/**
 * Created by twb on 2017/7/27.
 */
public class Main064 {

    public static int solve2(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];

        dp[0][0] = arr[0][0];

        for(int i = 1;i<m;i++){
            dp[i][0] = arr[i][0]+dp[i-1][0];
        }
        for(int j = 1; j<n;j++){
            dp[0][j] = arr[0][j]+dp[0][j-1];
        }
        for(int i=1;i<m;i++){
            for(int j = 1;j<n;j++){

                dp[i][j] = arr[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }


    public static void main(String[] args) {
        System.out.println(solve2(new int[][]{{3,7},{2,3}}));
    }

}
