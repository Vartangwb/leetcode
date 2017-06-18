package Array;

import Utils.Utils;

/**
 * Created by twb on 2017/6/7.
 */
public class Main243 {

    public static int solve(String[] res, String s1, String s2){
        int p1 = -1;
        int p2 = -1;
        int ress = Integer.MAX_VALUE;
        for(int i = 0;i<res.length;i++){
            if(s1.equals(res[i]))
                p1 = i;
            if(s2.equals(res[i])){
                p2 = i;
            }
            if(p1!=-1 && p2!=-1)
                ress = Math.min(ress, Math.abs(p1-p2));
        }
        return ress;
    }
    public static int solve3(String[] res, String s1, String s2){
        int p1 = res.length;
        int p2 = res.length*-1;
        int ress = Integer.MAX_VALUE;
        for(int i = 0;i<res.length;i++){
            if(s1.equals(res[i])){
                p1 = s1 == s2?p2:i;
            }
            if(s2.equals(res[i])){
                p2 = i;
            }
            ress = Math.min(ress, Math.abs(p2-p1));
        }
        return ress;
    }


    public static void main(String[] args) {
        Main243 main = new Main243();
        solve(new String[]{}, "","");
    }

}
