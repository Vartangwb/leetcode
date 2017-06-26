package HM;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by twb on 2017/6/19.
 */
public class Main451 {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(
                new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        if(o1.getValue() == o2.getValue()){
                            return o1.getKey() - o2.getKey();
                        }else
                            return o2.getValue() - o1.getValue();
                    }
                }
        );

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            priorityQueue.add(entry);
        }
        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            Map.Entry e = priorityQueue.poll();
            for (int i = 0; i < (int)e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.println(frequencySort("acdddd"));
    }



}