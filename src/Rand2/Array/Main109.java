package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main109 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<=rowIndex;i++){

            res.add(1);
            for(int j = i-1;j>=1;j--){
                res.set(j,res.get(j-1)+res.get(j));
                //System.out.println(res);
            }

        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(getRow(3));
    }
}
