package no201;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while(n!=m){
            m = m>>1;
            n = n>>1;
            i++;
        }
        return m<<i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rangeBitwiseAnd(4,7));
    }

}
