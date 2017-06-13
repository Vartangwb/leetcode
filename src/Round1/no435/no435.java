package Round1.no435;

import Round1.no436.Solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by twb on 2017/5/19.
 */
public class no435 {
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start == o2.start)
                    return o1.end - o2.end;
                return o1.start - o2.start;
            }
        });

        int res = 0;
        int tmp = intervals[0].end;
        for(int i = 1; i < intervals.length; i++){

            if(intervals[i].start < tmp){
                res++;
                tmp = Math.min(intervals[i].end, tmp);
            }else{
                tmp = intervals[i].end;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution.findRightInterval(new Interval[]{})
    }

}
