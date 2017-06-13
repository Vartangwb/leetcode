package Round1.no074;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int len2 = matrix[0].length;
        int i = 0;
        for(i = 0;i<len;i++){
            if(target<=matrix[i][len2-1])
                break;
        }
        //System.out.println(i);
        if(i==len)
            return false;
        int left = 0;
        int right = len2 - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(matrix[i][mid] == target){
                return true;
            }else if(matrix[i][mid]>target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchMatrix(new int[][]{{1,2},{3,4}},4));
    }

}
