package Round1.no318;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public int maxProduct(String[] words) {
        int len = words.length;
        int max = 0;
        int[] mask = new int[len];
        for(int i=0;i<len;i++){
            for(int j = 0;j<words[i].length();j++){
                mask[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if((mask[i] & mask[j])==0)
                    max = Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new String[]{"abc","asds","swww","err"}));

    }

}
