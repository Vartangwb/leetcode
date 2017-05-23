package no593;

import java.util.HashMap;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        long[] lengths = {length(p1, p2), length(p2, p3), length(p3, p4),
                length(p4, p1), length(p1, p3), length(p2, p4)}; // all 6 sides

        HashMap<Long , Integer> hm = new HashMap<>();
        for(int i=0;i<lengths.length;i++){
            if(hm.containsKey(lengths[i])==true){
                hm.put(lengths[i], hm.get(lengths[i])+1);
            }else{
                hm.put(lengths[i],1);
            }
        }
        if(hm.size()!=3 && hm.size()!=2){
            return false;
        }
        if(hm.size() == 3){
            long num1[] = new long[3];
            int curr = 0;
            for(long key:hm.keySet()){
                if(hm.get(key)!=2)
                    return false;
                num1[curr] = key;
            }
            if(num1[0]+num1[1] == num1[2] || num1[2]+num1[1] == num1[0] || num1[0]+num1[2] == num1[1])
                return true;
        }
        if(hm.size() == 2){
            long l1 = 0;
            long l2 = 0;
            for(long ket:hm.keySet()){
                if(hm.get(ket)!=2 && hm.get(ket)!=4){
                    return false;
                }
                if(hm.get(ket) == 2){
                    l1 = ket;
                }else {
                    l2 = ket;
                }
            }
            if(l1 == 2*l2)
                return true;

        }

            return false;
    }
    private long length(int[] p1, int[] p2) {
        return (long)Math.pow(p1[0]-p2[0],2) + (long)Math.pow(p1[1]-p2[1], 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validSquare(new int[]{0,0},new int[]{0,1},new int[]{1,0},new int[]{1,1}));
    }
}
