package no436;


import java.util.Map;
import java.util.TreeMap;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }

    public int[] findRightInterval(Interval[] intervals) {
        int len = intervals.length;
        int res[] = new int[len];
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0;i < len;i++){
            tm.put(intervals[i].start, i);
        }
        for(int i = 0; i < len; i++){
            Map.Entry<Integer, Integer> map = tm.ceilingEntry(intervals[i].end);
            res[i] = map == null ? -1 : map.getValue();
        }
        return res;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

    }

}
