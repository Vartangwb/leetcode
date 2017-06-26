package HM;

import java.util.HashMap;

/**
 * Created by twb on 2017/6/19.
 */
public class Main463 {

    public static int islandPerimeter(int[][] grid) {

        int len = grid.length;
        int len1 = grid[0].length;
        int res = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len1; j++){
                if(grid[i][j] == 1){
                    res+=4;
                    if(i>0 && grid[i-1][j]==1){
                        res-=2;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        res-=2;
                    }


                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(islandPerimeter(new int[][]{{1,0,0},{1,1,0}}));
    }



}