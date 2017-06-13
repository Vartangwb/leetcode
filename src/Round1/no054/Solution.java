package Round1.no054;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right =matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(true){
            for(int i = left; i<=right;i++){
                res.add(matrix[top][i]);
            }
            if(++top>bottom)
                break;
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            if(--right<left){
                break;
            }
            for(int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);
            }
            if(--bottom<top){
                break;
            }
            for(int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }
            if(++left>right)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
