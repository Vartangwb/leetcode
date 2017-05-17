package no524;


import java.util.List;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public String findLongestWord(String s, List<String> d) {

        String longest = "";
        for(String ss : d){
            int j = 0;
            for(int i = 0;i<s.length();i++){
                if(j<ss.length() && s.charAt(i) == ss.charAt(j))j++;
            }
            if(j == ss.length() && ss.length()>=longest.length()){
                if(ss.length()>longest.length()){
                    longest = ss;
                }
                if(ss.length() == longest.length()){
                    longest = longest.compareTo(ss)>0?ss:longest;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

    }

}
