package no059;

/**
 * Created by twb on 2017/5/21.
 */
public class Solution {


    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n==0)
            return matrix;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;
        while(true){
            for(int i=left;i<=right;i++){
                matrix[top][i] = num++;
            }
            if(++top>bottom)
                break;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = num++;
            }
            if(--right<left){
                break;
            }
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=num++;
            }
            if(--bottom<top){
                break;
            }
            for(int i=bottom;i>=top;i--){
                matrix[i][left] = num++;
            }
            if(++left>right)
                break;

        }
        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] tmp = solution.generateMatrix(3);
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
