package Round1.no452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int count = 1;
        int end = points[0][1];
        for(int i=0;i<points.length;i++){

//            int end = points[i][1];
            if(end>=points[i][0]){
                end = Math.min(end,points[i][1]);
            }else{
                count++;
                end = points[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMinArrowShots(new int[][]{{1,2},{2,3},{3,4}}));
    }

}
