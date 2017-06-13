package Round1.no467;

/**
 * Created by twb on 2017/5/26.
 */

/**
 * 这道题说有一个无限长的封装字符串，然后又给了我们另一个字符串p，问我们p有多少非空子字符串在封装字符串中。
 * 我们通过观察题目中的例子可以发现，由于封装字符串是26个字符按顺序无限循环组成的，那么满足题意的p的子字符串
 * 要么是单一的字符，要么是按字母顺序的子字符串。这道题遍历p的所有子字符串会TLE，因为如果p很大的话，子字符串
 * 很多，会有大量的满足题意的重复子字符串，必须要用到trick，而所谓技巧就是一般来说你想不到的方法。我们看abcd
 * 这个字符串，以d结尾的子字符串有abcd, bcd, cd, d，那么我们可以发现bcd或者cd这些以d结尾的字符串的子字符串都
 * 包含在abcd中，那么我们知道以某个字符结束的最大字符串包含其他以该字符结束的字符串的所有子字符串，说起来很拗
 * 口，但是理解了我上面举的例子就行。那么题目就可以转换为分别求出以每个字符(a-z)为结束字符的最长连续字符串就行
 * 了，我们用一个数组cnt记录下来，最后在求出数组cnt的所有数字之和就是我们要的结果啦
 */


public class Solution {

    int findSubstringInWraproundString(String p) {

        int[] arr = new int[26];
        int count = 1;
        for(int i = 0; i<p.length();i++){
            if(i!=0 &&(p.charAt(i) - p.charAt(i-1) == 1 || p.charAt(i) - p.charAt(i-1) == 25)){
                count++;
            }else{
                count = 1;
            }
            arr[p.charAt(i) - 'a'] = Math.max(arr[p.charAt(i) - 'a'], count);
        }
        for(int i = 1;i<26;i++){
            arr[0]+=arr[i];
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubstringInWraproundString("abcza"));
    }

}
