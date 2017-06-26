package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main575 {

    public static int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }


    public static void main(String[] args) {


        System.out.println(distributeCandies(new int[]{1,1,1,2,3,4}));
    }
}



