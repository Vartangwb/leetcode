package HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/19.
 */
public class Main202 {

   public static void solve(int n){


       HashMap<Integer, Integer> hm = new HashMap<>();
       int sum = 0;
       while(n!=1){
           sum = 0;
           while(n>0){
               sum+=(n%10)*(n%10);
               n/=10;
           }
           if(hm.containsKey(sum)){
               System.out.println(false);;
           }else{
               hm.put(sum,1);
           }
           n = sum;
       }
       System.out.println(true);;


   }

    public static void main(String[] args) {

       solve(10);

    }



}