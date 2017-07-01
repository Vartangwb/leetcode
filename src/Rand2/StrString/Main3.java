package StrString;

import java.util.Arrays;

/**
 * Created by twb on 2017/7/1.
 */
public class Main3 {

    public static int lengthOfLongestSubstring1(String s){

        int len = s.length();
        boolean flag[] = new boolean[256];
        Arrays.fill(flag,false);
        int i = 0;
        int j = 0;
        int maxLen = 0;
        while(j<len){
            if(flag[s.charAt(j)]==false){
                flag[s.charAt(j)] = true;
                j++;
            }else{
                while(s.charAt(i)!=s.charAt(j)){
                    flag[s.charAt(i)] = false;
                    i++;
                }
                i++;
                j++;
            }
            int currLen = j-i;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("adcwebdsad"));
    }

}
