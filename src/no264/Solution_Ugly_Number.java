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

    public static void main(String[] args) {
        Solution_Ugly_Number solution = new Solution_Ugly_Number();
        System.out.println(solution.nthUglyNumber(3));
    }
}


