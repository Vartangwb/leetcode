package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main229 {

    public static List<Integer> majorityElement(int[] nums) {
        int m = 0;
        int n = 0;
        int currm = 0;
        int currn = 0;
        int i = 0;

        while(i<nums.length){
            if(currm==nums[i]){
                m++;
            }else if(currn==nums[i]){
                n++;
            }
            else if(m==0){
                currm = nums[i];
                m = 1;
            }
            else if(n==0){
                currn = nums[i];
                n = 1;
            }
            else{
                m--;
                n--;
            }
            i++;
        }
        List<Integer> res = new ArrayList<>();
        m=0;
        n=0;
        for(i=0;i<nums.length;i++){
            if(currn==nums[i])
                n++;
            else if(currm==nums[i])
                m++;
        }
        if(m>nums.length/3)
            res.add(currm);
        if(n>nums.length/3)
            res.add(currn);
        return res;

    }
    public static void main(String[] args) {
        Main229 main = new Main229();
        System.out.println(main.majorityElement(new int[]{2,2,2,2,27,11,11,11,15}));
    }

}
