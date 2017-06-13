package Round1.no274;

import java.util.Arrays;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i = citations.length;i>=0;i--){
            if(citations.length - i - 1 >= citations[i]){
                return citations.length - i - 1;
            }
        }
        return citations.length;
    }

}
