package Round1.no137;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 1;i<=len;i++){
            for(int j = 0;j<i;j++){
                if(dp[j]==true && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ls = new ArrayList<>();
        ls.add("leet");
        ls.add("code");
        System.out.println(solution.wordBreak("leetcode", ls));
    }

}
