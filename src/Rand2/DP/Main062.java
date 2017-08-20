package DP;

/**
 * Created by twb on 2017/7/27.
 */
public class Main062 {

    public static int solve(int arr[]){
        int dp[][] = new int[arr[0]][arr[1]];
        for(int i = 0;i<arr[0];i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j<arr[1];j++){
            dp[0][j] = 1;
        }
        for(int i=1;i<arr[0];i++){
            for(int j = 1;j<arr[1];j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[arr[0]-1][arr[1]-1];
    }
    public static int solve2(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];
        if(arr[0][0] == 1){
            dp[0][0] = 0;
        }else{
            dp[0][0] = 1;
        }
        for(int i = 1;i<m;i++){
            if(arr[i][0]!=1 && dp[i-1][0]!=0)
                dp[i][0] = 1;
        }
        for(int j = 1; j<n;j++){
            if(arr[0][j]!=1 && dp[0][j-1]!=0)
                dp[0][j] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(arr[i][j]==1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }



    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,7}));
    }

}
