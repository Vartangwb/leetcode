package no207;

import java.util.*;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> arr = new HashMap<>();
        int[] in = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<prerequisites.length;i++) {
            if (arr.get(prerequisites[i][1]) != null) {

                arr.get(prerequisites[i][1]).add(prerequisites[i][0]);
                in[prerequisites[i][0]]++;
            } else {
                List<Integer> laa = new ArrayList<>();
                laa.add(prerequisites[i][0]);
                arr.put(prerequisites[i][1], laa);

                in[prerequisites[i][0]]++;
            }
        }
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                queue.add(i);
            }
        }

        List<Integer> ls = new ArrayList<>();
        while(queue.size()>0){
            int num = queue.poll();
            //if(arr.get(num)!=null)
            ls = arr.get(num);
            //else
            //    ls = null;
            if(ls!=null)
                for(int i:ls){
                    in[i]--;
                    if(in[i]==0)
                        queue.add(i);
                }
        }
        for(int i=0;i<numCourses;i++){
            if(in[i]!=0)
                return false;
        }
        return true;
    }

}
