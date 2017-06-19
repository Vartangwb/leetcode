package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            res[i/c][i%c] = nums[i/m][i%m];
        return res;
    }
    public static void main(String[] args) {
        Main566 main = new Main566();
        System.out.println(matrixReshape(new int[][]{{0,0},{0,0}},2,2));
    }

}
