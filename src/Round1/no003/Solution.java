package Round1.no003;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    int lengthOfLongestSubstring(String s){

        int len = s.length();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int currLen = 0;
        boolean flag[] = new boolean[256];
        while(j<len){
            if(flag[s.charAt(j)] != true){
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
            currLen = j-i;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcda"));
    }
}
