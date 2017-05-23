package no264;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution_Ugly_Number {


    public int nthUglyNumber(int n) {
        int []res = new int[n];
        res[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int curr = 1;
        while(curr<n){
            int min = Math.min(res[index2]*2,Math.min(res[index3]*3, res[index5]*5));
            if(min == res[index2]*2){
                index2++;
            }else if(min == res[index3]*3){
                index3++;
            }else{
                index5++;
            }
            res[curr] = min;
            curr++;
        }
        return res[n-1];
    }
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] res = new int[n];
        int len = primes.length;
        int dp[] = new int[len];
        res[0] = 1;
        int curr = 1;
        while(curr<n){
            int min = Integer.MAX_VALUE;
            for(int i = 0;i < len;i++){
                min = Math.min(min, res[dp[i]] * primes[i]);
            }
            for(int i = 0; i < len; i++){
                if(min == res[dp[i]] * primes[i])
                    dp[i]++;
            }
            res[curr] = min;
            curr++;
        }
        return res[n-1];
    }


    public static void main(String[] args) {
        Solution_Ugly_Number solution = new Solution_Ugly_Number();
        System.out.println(solution.nthUglyNumber(3));
        System.out.println(solution.nthSuperUglyNumber(12,new int[]{2, 7, 13, 19}));
    }
}


