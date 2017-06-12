package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main073 {

    public static void setZeroes(int[][] matrix) {
        boolean flag1 = false;
        boolean flag2 = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            if(matrix[i][0]==0)
                flag1=true;
        }
        for(int j = 0;j<matrix[0].length;j++){
            if(matrix[0][j]==0)
                flag2 = true;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(matrix[i][0] == 0){
                for(int j = 1;j<n;j++){
                    matrix[i][j] = 0;
                }
            }
        }


        for(int i=1;i<n;i++){
            if(matrix[0][i] == 0){
                for(int j = 1;j<m;j++){
                    matrix[j][i] = 0;
                }
            }
        }

        if(flag1==true){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
        if(flag2 == true)
            for(int j = 0;j<n;j++){
            matrix[0][j] = 0;
            }
    }
    public static void main(String[] args) {

        setZeroes(new int[][]{{0,1},{1,0}});
    }
}
