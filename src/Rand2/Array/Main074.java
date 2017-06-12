package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main074 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;
        int index = -1;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            if(matrix[i][n-1]>=target)
            {
                index = i;
                break;
            }
        }
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[index][mid] == target)
                return true;
            if(matrix[index][mid]>target){
                right=mid-1;
            }
            if(matrix[index][mid]<target){
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(searchMatrix(new int[][]{{0,1},{2,3}}, 1));
    }
}
