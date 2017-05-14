package no560;

import java.util.HashMap;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    public int subarraySum(int[] a, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum-k);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subarraySum(new int[]{1,1,1},2);
    }

}
