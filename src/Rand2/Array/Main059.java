package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main059 {

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0)
            return matrix;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int co = 1;
        while(true){

            for(int i=left;i<=right;i++){
                matrix[top][i] = co++;
            }
            top++;
            if(top>bottom)
                break;
            for(int i = top;i<=bottom;i++){
                matrix[i][right] = co++;
            }
            right--;
            if(right<left)
                break;
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=co++;
            }
            if(--bottom<top){
                break;
            }
            for(int i=bottom;i>=top;i--){
                matrix[i][left] = co++;
            }
            if(++left>right)
                break;

        }
        return matrix;
    }
    public static void main(String[] args) {

        System.out.println(generateMatrix(3));
    }
}
