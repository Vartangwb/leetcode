package Round1.no474;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    int findMaxForm(String[] strs, int m, int n){

        int len = strs.length;
        int dp[][][] = new int[2][m+1][n+1];
        for(int i = 0; i < strs.length; i++){

        }
        dp[0][0][0] = 0;
        dp[1][0][0] = 0;
        for(int k = 1; k <= strs.length; k++){

            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < strs[k-1].length(); i++){
                if(strs[k-1].charAt(i) == '0'){
                    count1++;
                }else{
                    count2++;
                }
            }
            int pre = (k+1)&1;
            int now = k&1;

            for(int i = 0;i<=m;i++){
                for(int j = 0;j<=n;j++){
                    dp[now][i][j] = dp[pre][i][j];
                }
            }

            for(int i = 0;i<=m;i++){
                for(int j = 0;j<=n;j++){
                    if(i>=count1 && j>=count2){
                        dp[now][i][j] = Math.max(dp[now][i][j], dp[pre][i-count1][j-count2]+1);
                    }

                    //System.out.print(dp[now][i][j]+" ");

                }
                //System.out.println(" ");
            }

        }
        return dp[strs.length&1][m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxForm(new String[]{"10", "11", "00"}, 1,1));
    }
    }


