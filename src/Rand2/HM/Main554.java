package HM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/6/19.
 */
public class Main554 {

    public static int leastBricks(List <List< Integer >> wall) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(List<Integer> ls : wall){
            int sum = 0;
            for(int i = 0; i < ls.size() - 1; i++){
                sum += ls.get(i);
                if(hm.containsKey(sum))
                    hm.put(sum, hm.get(sum) + 1);
                else{
                    hm.put(sum, 1);
                }
            }
        }
        int res = wall.size();
        for(int ii:hm.keySet()){
            res = Math.min(res, wall.size() - hm.get(ii));
        }
        return res;
    }
    public static void main(String[] args) {


        System.out.println(leastBricks(null));
    }
}



