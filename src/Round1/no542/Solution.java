package Round1.no542;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    //广度优先搜索可以用来解决最短路径问题；
    int dir[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    queue.add(new int[]{i,j});
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while(queue.isEmpty() == false){
            int tmp[] = queue.poll();
            for(int i = 0;i<4;i++){
                int currx = tmp[0]+dir[i][0];
                int curry = tmp[1]+dir[i][1];
                if(currx>=0 && currx<m && curry>=0 && curry<n){
                    if(matrix[currx][curry]>matrix[tmp[0]][tmp[1]]+1){
                        matrix[currx][curry] = matrix[tmp[0]][tmp[1]]+1;
                        queue.add(new int[]{currx, curry});
                    }
                }
            }
        }
        return matrix;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int ttt[][] = solution.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
        for(int ii[]:ttt){
            for(int i:ii){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
