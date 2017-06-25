package HM;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/19.
 */
public class Main299 {


    public static String getHint(String secret, String guess) {

        int a[] = new int[10];
        int b[] = new int[10];
        int res_A = 0;
        int res_B = 0;
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i))
                res_A++;
            a[secret.charAt(i)-'0']++;
            b[guess.charAt(i)-'0']++;
        }
        for(int i = 0; i < 10; i++){
            res_B+=Math.min(a[i],b[i]);
        }
        return ""+res_A+"A"+(res_B-res_A)+"B";
    }
        public static void main(String[] args) {

        System.out.println(getHint("1001","0121"));;

    }



}