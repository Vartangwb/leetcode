package StrString;

import java.util.Collections;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main549 {

    public static int findMinDifference(List<String> timePoints) {

        Collections.sort(timePoints);
        int totalMin = 24*60;
        System.out.println(totalMin);
        int res = 1441;
        for(int i=0;i<timePoints.size();i++){

            String[] time1 = timePoints.get(i).split(":");
            String[] time2;
            if(i==timePoints.size()-1)
                time2 = timePoints.get(0).split(":");
            else{
                time2 = timePoints.get(i+1).split(":");
            }


            int time1_min = Integer.valueOf(time1[0])*60 + Integer.valueOf(time1[1]);
            int time2_min = Integer.valueOf(time2[0])*60 + Integer.valueOf(time2[1]);

            int mm = Math.abs(time1_min - time2_min);
            int ti = totalMin - mm - 0;
            res = Math.min(res,Math.min(mm, ti));
        }
        return res;
    }
    public static void main(String[] args) {
            System.out.println(findMinDifference(null));
    }

}
