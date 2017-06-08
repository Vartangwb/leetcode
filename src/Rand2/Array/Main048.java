package Array;

import Utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main048 {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int num = n/2;
        //n=n/2;
        for(int i=0;i<num;i++){
            for(int j=i;j<n-i-1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }

        Utils.printArr2D(matrix);
    }

    public static void main(String[] args) {

        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
