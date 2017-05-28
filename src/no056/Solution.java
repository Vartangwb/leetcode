package no056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start == o2.start)
                    return o1.end - o2.end;
                return o1.start - o2.start;
            }
        });

        List<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));
        for(int i = 1;i<intervals.size();i++){
            Interval tmp = res.get(res.size()-1);
            if(intervals.get(i).start<tmp.end){
                tmp.end = Math.max(intervals.get(i).end, tmp.end);
                res.remove(res.size()-1);
                res.add(tmp);
            }else{
                res.add(intervals.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Interval l1 = new Interval(1,3);
        Interval l2 = new Interval(2,4);
        List<Interval> ls = new ArrayList<>();
        ls.add(l1);
        ls.add(l2);
        System.out.println(solution.merge(ls).size());
    }

}
