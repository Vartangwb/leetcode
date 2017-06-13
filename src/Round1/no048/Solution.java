package Round1.no048;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int num = n/2;
        for(int i = 0; i < num; i++){
            for(int j = i; j < n - i -1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[n-j-1][i];
                matrix[n-j-1][i] = tmp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int sss[][] = solution.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for(int[] ssss:sss){
            for(int i:ssss){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
