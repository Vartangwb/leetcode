package no361;

/**
 * Created by twb on 2017/5/22.
 */

/**
 * time:O(mn)
 * 
 */
public class Solution {
    public int maxKilledEnemies(char[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0) return 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        int max = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 'W') continue;
                if (j==0 || grid[i][j-1]=='W') {
                    row = calcRowEnemy(grid, i, j);
                }
                if (i==0 || grid[i-1][j]=='W') {
                    col[j] = calcColEnemy(grid, i, j);
                }
                if (grid[i][j] == '0') {
                    max = Math.max(max, row+col[j]);
                }
/*
                for(int kk = 0;kk<col.length;kk++){
                    System.out.print(col[kk]+" ");
                }
                System.out.println("haha"+row+ "hehe" + max);
                */
            }
        }
        return max;
    }
    //计算行上的enemy
    public int calcRowEnemy(char[][] grid, int i, int j) {
        int res = 0;
        while (j<grid[0].length && grid[i][j]!='W') {
            res = res + (grid[i][j]=='E'? 1 : 0);
            j++;
        }
        return res;
    }

    public int calcColEnemy(char[][] grid, int i, int j) {
        int res = 0;
        while (i<grid.length && grid[i][j]!='W') {
            res = res + (grid[i][j]=='E'? 1 : 0);
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxKilledEnemies(new char[][]{{'E','E','E','E'}, {'E','0','E','E'},{'E','E','E','E'},{'E','E','E','E'}}));
    }
}
