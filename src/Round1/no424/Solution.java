package Round1.no424;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {


    public int characterReplacement(String s, int k) {
        if(s.length() == 0){
            return 0;

        }

        int arr[] = new int[26];
        int left = 0;
        int most = 1;
        int res = 0;
        arr[s.charAt(0)-'A'] = 1;
        for(int right = 1; right < s.length(); right++){
            most = Math.max(most, ++arr[s.charAt(right) - 'A']);
            if(most + k < right - left + 1){
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }



    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.characterReplacement("ABBA", 2));
    }

}
