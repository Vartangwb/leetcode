package HM;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/19.
 */
public class Main204 {

   public static int solve(int n){

       boolean isPrime[] = new boolean[n];
       for(int i = 2;i<n;i++){
           if(isPrime[i]==false) {


               for (int j = 2 * i; j < n; j += i) {
                    isPrime[j] = true;
               }
           }else{
               continue;
           }
       }
       int cnt = 0;
       for(int i = 2;i<n;i++){
           if(isPrime[i]==false)
               cnt++;
       }
       return cnt;
   }

    public static void main(String[] args) {

       solve(10);

    }



}