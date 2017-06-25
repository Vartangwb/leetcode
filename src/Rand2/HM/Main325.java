package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main325 {


    public static int solve(int[] arrs, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        hm.put(0,0);
        for(int i = 0;i<arrs.length;i++){
            sum+=arrs[i];
            int look = sum - k;
            if(hm.containsKey(look)){
                max = Math.max(max, i - hm.get(look)+1);

            }
            if(hm.containsKey(sum)==false){
                hm.put(sum, i+1);
            }
        }
        if(max == Integer.MIN_VALUE)
            return 0;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, -1, 5, -2, 3}, 3));
    }



}