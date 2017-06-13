package Round1.no073;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public void setZeroes(int[][] matrix) {
        boolean flag1 = false;
        boolean flag2 = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)
                flag1 = true;
        }
        for(int j = 0;j<matrix[0].length;j++){
            if(matrix[0][j]==0)
                flag2 = true;
        }
        for(int i=1;i<matrix.length;i++)
            for(int j = 1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        //把第一列的0所在行都设为0，把第一行的0所在列都设为0
        for (int i = 1; i < m; i++) {
            if (0 == matrix[i][0]) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (0 == matrix[0][j]) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //根据标记决定第一行和第一列是否全设为0
        if (flag2) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (flag1) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
