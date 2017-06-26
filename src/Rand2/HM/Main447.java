package HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/19.
 */
public class Main447 {

    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;

        for(int i = 0;i<points.length;i++){
            HashMap<Integer,Integer> hm = new HashMap<>();
            int currx = points[i][0];
            int curry = points[i][1];
            for(int j = 0; j < points.length; j++){
                int dis = (currx - points[j][0])*(currx - points[j][0]) + (curry - points[j][1])*(curry - points[j][1]);
                if(hm.containsKey(dis)){
                    hm.put(dis, hm.get(dis)+1);
                }else{
                    hm.put(dis,1);
                }
            }
            for(Integer r:hm.keySet()){
                res+=hm.get(r)*(hm.get(r)-1);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(numberOfBoomerangs(new int[][]{{1,0},{2,0},{0,0}}));
    }



}