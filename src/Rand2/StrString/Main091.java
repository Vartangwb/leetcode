package StrString;

import java.util.Stack;

/**
 * Created by twb on 2017/7/1.
 */
public class Main091 {

    public static int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int len = s.length();
        int dp[] = new int[len+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0'?1:0;
        for(int i = 2;i<=len;i++){
            if(Integer.parseInt(s.substring(i-2,i))>=10 && Integer.parseInt(s.substring(i-2,i))<=26){
                dp[i] += dp[i-2];
            }
            if(Integer.parseInt(s.substring(i-1,i))!=0){
                dp[i] += dp[i-1];
            }
            for(int ii = 0; ii<=len;ii++){
                System.out.print(dp[ii]+" ");
            }
            System.out.println(" ");
        }
        return dp[len];
    }
    public static void main(String[] args) {
        System.out.println(numDecodings("12310"));
    }

}
