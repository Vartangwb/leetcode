package HM;

/**
 * Created by twb on 2017/6/19.
 */
public class Main003 {

    int lengthOfLongestSubstring(String s) {

        boolean[] hm = new boolean[256];
        int currLen = 0;
        int maxLen = 0;
        int i = 0;
        int j = 0;
        while(i<s.length()){
            if(hm[s.charAt(i)]==false){
                i++;
                hm[s.charAt(i)]=true;
            }else{
                while(s.charAt(i)!=s.charAt(j)){
                    hm[s.charAt(j)]=false;
                    j++;

                }
                i++;
                j++;
            }

            currLen = i-j;
            maxLen = Math.max(currLen, maxLen);

        }
        return maxLen;
    }



}