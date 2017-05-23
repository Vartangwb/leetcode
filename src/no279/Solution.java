package no279;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public int numSquares(int n) {
        if(n<=1)
            return 1;
        while(n%4==0){
            n/=4;
        }
        if(n%8==7){
            return 4;
        }
        for(int i=0;i*i<n;i++){
            int b = (int)Math.sqrt(n-i*i);
            if(i*i+b*b==n){
                if(i!=0 && b!=0)
                    return 2;
                else if(1!=0 || b!=0){
                    return 1;
                }
            }
        }
        return 3;
    }

}
