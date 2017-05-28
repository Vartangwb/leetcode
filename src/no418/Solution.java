package no418;

/**
 * Created by twb on 2017/5/28.
 */
public class Solution {

    public int wordsTyping(String[] sentence, int rows, int cols) {

        int i = 0;
        int j = 0;
        int k = 0;
        int times = 0;
        int len = sentence.length;
        while(i<rows && j<cols){
            if(sentence[k].length()>cols)
                break;
            int reamin = cols - j;
            if(reamin == sentence[k].length() || reamin == sentence[k].length()+1){
                k++;
                i++;
                j=0;
            }else if(reamin>sentence[k].length()){
                j+=sentence[k].length()+1;
                k++;
            }else{
                i++;
                j=0;
            }
            if( k == sentence.length) {k = 0; times ++;}


        }
        return times;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordsTyping(new String[]{"ab","cd","ed"},7,3));
    }
}
