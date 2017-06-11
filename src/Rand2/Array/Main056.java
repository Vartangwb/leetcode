package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main056 {

    public static List<Interval> merge(List<Interval> intervals) {
        if(intervals==null || intervals.size()==0)
            return new ArrayList<>();
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
        int end = intervals.get(0).end;
        for(int i = 1;i<intervals.size();i++){
            if(intervals.get(i).start<=end){
                end = Math.max(end, intervals.get(i).end);
                Interval tmp = res.get(res.size()-1);
                tmp.end = end;
                res.remove(res.size()-1);
                res.add(tmp);
            }else{
                res.add(intervals.get(i));
                end = intervals.get(i).end;
            }


        }
        return res;

    }
    public static void main(String[] args) {


        System.out.println(merge(new ArrayList<>()));
    }
}
  class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }