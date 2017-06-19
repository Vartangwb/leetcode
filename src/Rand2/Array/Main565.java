package Array;

import java.util.Arrays;

/**
 * Created by twb on 2017/6/7.
 */
public class Main565 {
    public static int arrayNesting(int[] a) {

        int len = a.length;
        int size = 0;
        int res = 0;
        for(int i = 0;i<len;i++){
            size = 0;
            int k = i;
            while(a[k]>=0){
                size++;
                int kk = a[k];
                a[k] = -1;
                k=kk;
            }

            res = Math.max(res, size);
        }
        return res;

    }
    public static void main(String[] args) {
        Main565 main = new Main565();
        System.out.println(arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }

}
