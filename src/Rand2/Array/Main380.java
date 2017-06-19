package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import static Utils.Utils.printArr;

/**
 * Created by twb on 2017/6/7.
 */
public class Main380{
    public static void main(String[] args) {
        Main380 main = new Main380();
        RandomizedSet randomizedSet = new RandomizedSet();
    }
}

class RandomizedSet {

    List<Integer> ls;
    HashMap<Integer, Integer> hm;// = new HashMap<>();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        ls = new ArrayList<>();
        hm = new HashMap<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.containsKey(val)){
            return false;
        }
        int size = ls.size();
        hm.put(val, size);
        ls.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hm.containsKey(val))
            return false;
        int vall = ls.get(ls.size()-1);
        int loc = hm.get(val);
        if(loc != ls.size()-1) {
            ls.set(loc, vall);
        }
        hm.remove(val);
        ls.remove(ls.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return ls.get(new Random().nextInt(ls.size()));
    }


}
