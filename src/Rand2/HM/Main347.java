package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main347 {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        priorityQueue.addAll(hm.entrySet());
        while(k>0){
            ls.add(priorityQueue.poll().getKey());
            k--;
        }
        return ls;
    }
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3,3},2));
    }



}