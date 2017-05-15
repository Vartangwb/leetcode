package no583;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0;i <= m;i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 0;

                }else if(i == 0 && j!=0){
                    dp[i][j] = 1 + dp[i][j-1];
                }else if(j == 0 && i!=0){
                    dp[i][j] = 1 +dp[i-1][j];
                }else if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        /*
        for(int[] i:dp){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println("asd");

        }*/
        return dp[m][n];
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDistance("sea", "eat"));
    }

}
