package StrString;

/**
 * Created by twb on 2017/7/1.
 */
//http://blog.csdn.net/u013055770/article/details/72639598
    //最长公共子序列
public class Main583 {

   static int minDistance(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();
        int dp[][] = new int[len1+1][len2+1];
        for(int i = 1;i<=len1;i++){
            dp[i][0] = dp[i-1][0]+1;
        }

        for(int j = 1;j<=len2;j++){
            dp[0][j] = dp[0][j-1]+1;
        }
        for(int i = 1;i<=len1;i++){
            for(int j = 1;j<=len2;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[len1][len2];

    }
    public static void main(String[] args) {
            System.out.println(minDistance("asdsa asjdhk","asd"));
    }

}
