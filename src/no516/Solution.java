package no516;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }
   public int longestPalindromeSubseq(String s) {
       int[][] dp = new int[s.length()][s.length()];

       for (int i = s.length() - 1; i >= 0; i--) {
           dp[i][i] = 1;
           for (int j = i+1; j < s.length(); j++) {
               if (s.charAt(i) == s.charAt(j)) {
                   dp[i][j] = dp[i+1][j-1] + 2;
               } else {
                   dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
               }
               /*
               System.out.println("haha" + i);
               System.out.println("haha" + j);
               for(int ii=0;ii<dp.length;ii++) {
                   for (int jj = 0; jj < dp[0].length; jj++) {
                       System.out.print(dp[ii][jj]);
                   }
                   System.out.println("");
               }
               System.out.println("\n");*/
           }

       }
       return dp[0][s.length()-1];
   }
    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.longestPalindromeSubseq("abdsca");
    }

}
