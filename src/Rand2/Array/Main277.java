package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main277 {

    public static boolean knows(int i, int j){
        return true;
    }

    public static int solve(int n){
        boolean flag[] = new boolean[n];
        Arrays.fill(flag,true);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j!=i && flag[i]){
                    if(knows(i,j) && !knows(j,i)){
                        flag[j]=false;
                    }else{
                        flag[i]=false;
                        break;
                    }
                }
                if(flag[i]==true)
                    return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Main277 main = new Main277();
        System.out.println(solve(3));
    }

}
