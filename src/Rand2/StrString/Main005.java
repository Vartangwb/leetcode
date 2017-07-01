package StrString;

import java.util.Arrays;

/**
 * Created by twb on 2017/7/1.
 */
public class Main005 {

    public static String longestPalindrome(String s) {

        int len = s.length();
        if(len<=1)
            return s;
        int maxLens = 1;
        int start = 0;
        boolean flag[][] = new boolean[1001][1001];
        for(int i = 0;i<len;i++){
            flag[i][i]=true;
            if(i < len - 1 && s.charAt(i) == s.charAt(i + 1)){

                flag[i][i+1] = true;
                maxLens = 2;
                start = i;
            }
        }
        for(int i = 3;i<=len;i++){
            for(int j = 0;j<=len-i;j++){
                int end = j+i-1;
                if(flag[j+1][end-1]&&s.charAt(j)==s.charAt(end))
                {
                    flag[j][end]=true;
                    maxLens=len;
                    start=j;
                }
            }
        }
        if(maxLens==1)
            return s.substring(0,1);
        if(maxLens>=2)
            return s.substring(start,start+maxLens);
        return null;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcddcba"));
    }

}
