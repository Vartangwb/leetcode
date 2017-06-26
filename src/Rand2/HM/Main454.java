package HM;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by twb on 2017/6/19.
 */
public class Main454 {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j < B.length; j++){
                if(hm.containsKey(A[i]+B[j])){
                    hm.put(A[i]+B[j], hm.get(A[i]+B[j])+1);
                }else{
                    hm.put(A[i]+B[j], 1);
                }
            }
        }
        int res = 0;
        for(int i = 0;i<C.length;i++){
            for(int j = 0;j < D.length; j++){
                int sum = C[i]+D[j];
                if(hm.containsKey(-sum)){
                    res+=hm.get(-sum);
                }else{
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(fourSumCount(null,null, null, null));
    }



}