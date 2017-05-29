package no365;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    public boolean canMeasureWater(int x, int y, int z) {
        if(x == 0 ||(x+y>=z && z%gcd(x,y)==0))
            return true;
        return false;
    }

    int gcd(int x,int y){
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        System.out.println(solution.canMeasureWater(3,5,4));
    }

}
