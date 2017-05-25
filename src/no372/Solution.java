package no372;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int res = 1;
        for(int i = 0;i<b.length;i++){
            res = myPower(res, 10) * myPower(a, b[i]) % MOD;
        }
        return res;
    }

    public int myPower(int a, int b){
        if(b == 0)
            return 1;
        if(b == 1)
            return a % MOD;
        return myPower(a % MOD, b/2) * myPower(a % MOD, b - b / 2) %MOD;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.superPow(2,new int[]{1,0}));
    }

}
