package Array;

import static Utils.Utils.printArr;

/**
 * Created by twb on 2017/6/7.
 */
public class Main370 {

    public static int[] getModifiedArray(int length, int[][] updates) {

        int[] res = new int[length];

        for(int i = 0;i<updates.length;i++){
            int start = updates[i][0];
            int end = updates[i][1];
            res[start]+=updates[i][2];
            if(end!=length-1){
                res[end+1]-=updates[i][2];
            }
        }
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum+=res[i];
            res[i] = sum;
        }

        return res;
    }
    public static void main(String[] args) {
        Main370 main = new Main370();
        printArr(getModifiedArray(5,new int[][]{{1,  3,  2},
        {2,  4,  3},
        {0,  2, -2}}));
    }

}
