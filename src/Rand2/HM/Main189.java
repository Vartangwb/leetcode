package HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/19.
 */
public class Main189 {

   public static void solve(String s){

       List<String> res = new ArrayList<>();

       HashMap<Integer, Integer> map = new HashMap<>();
       int mask = 0x7ffffff;
       int i = 0;
       int num = 0;
       while(i<9){
           num = num<<3 | (s.charAt(i) & 0x07);
           i++;
       }
       int curr = num;
       while(i<s.length()){
           curr = (((curr& mask) << 3)) | (s.charAt(i) & 0x7);
           if(map.containsKey(curr)==false){
               map.put(curr,1);
           }else{
               if(map.get(curr)==1)
                   res.add(s.substring(i-9,i+1));
               int num1 = map.get(curr)+1;
               map.put(curr,num1);

           }
           i++;
       }

       System.out.println(res);;


   }

    public static void main(String[] args) {
        solve("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
    }



}