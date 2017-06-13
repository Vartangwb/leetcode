package Round1.no240;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int len_ = matrix[0].length;
        int right = len_ - 1;
        int top = 0;
        while(right>=0 && top<=len-1){
            if(matrix[top][right] == target)
                return true;
            else if(matrix[top][right] > target){
                right--;
            }else{
                top++;
            }
        }
        return false;
    }

}
