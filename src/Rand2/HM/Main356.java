package HM;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by twb on 2017/6/19.
 */
public class Main356 {

    public boolean isReflected(int[][] points) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<String> set = new HashSet<String>();
        for (int[] p : points) {
            set.add(p[0] + "," + p[1]);
            min = Math.min(min, p[0]);
            max = Math.max(max, p[0]);
        }

        int sum = min + max;
        for (int[] p : points) {
            if (!set.contains((sum - p[0]) + "," + p[1])) {
                return false;
            }
        }
        return true;
    }

    //http://www.cnblogs.com/grandyang/p/5533305.html
    public static void main(String[] args) {
        System.out.println();
    }



}