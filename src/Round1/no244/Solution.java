package Round1.no244;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    int shortestDistance(String[] words, String word1, String word2){
        int curr1 = -1;
        int curr2 = -1;
        int min = Integer.MIN_VALUE;
        for(int i = 0;i<words.length;i++){
            if(word1.equals(words[i])){
                curr1 = i;
                if(curr2!=-1){
                    min = Math.min(min, Math.abs(curr1 - curr2));
                }
            }else if(word2.equals(words[i])){
                curr2 = i;
                if(curr1!=-1){
                    min = Math.min(min, Math.abs(curr1-curr2));
                }
            }
        }
        return min;
    }

}
