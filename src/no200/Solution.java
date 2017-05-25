package no200;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    int res = 0;
    int [][] dir = new int[][]{{1, 0},{0, 1},{-1, 0},{0, -1}};
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    res++;
                    grid[i][j] = '0';
                    dfs(grid, i,j,m,n);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int x, int y, int m, int n){
        for(int i = 0;i<4;i++){
            int currx = x + dir[i][0];
            int curry = y + dir[i][1];
            if(currx>=0 && currx<m && curry>=0 && curry<n && grid[currx][curry]=='1'){
                grid[currx][curry] = '0';
                dfs(grid, currx, curry, m, n);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numIslands(new char[][]{"11110".toCharArray(),
                "11010".toCharArray(),"11000".toCharArray(),"00000".toCharArray()}));
    }

}
