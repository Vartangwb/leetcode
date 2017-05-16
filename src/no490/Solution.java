package no490;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }



    int dir[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
   public boolean hasPath(int[][] maze, int[] start, int[] destination) {
       boolean flag[][] = new boolean[maze.length][maze[0].length];
       return dfs(maze, start, destination, flag);
   }
   public boolean dfs(int[][] maze, int[] start, int[] destination, boolean flag[][]){



       if(start[0] == destination[0] && start[1] == destination[1]){
           return true;
       }
       if(flag[start[0]][start[1]] == true)
           return false;

       flag[start[0]][start[1]] = true;
       for(int ii = 0;ii<maze.length;ii++){
           for(int jj = 0;jj<maze[0].length;jj++){
               System.out.print(flag[ii][jj]+"  ");
           }
           System.out.println("");
       }
       System.out.println("asd");

       for(int i=0;i<4;i++){
           int currx = start[0];
           int curry = start[1];
           while(currx+dir[i][0]>=0 && currx+dir[i][0]<maze.length
                   && curry+dir[i][1]>=0 && curry+dir[i][1]<maze[0].length
                   && maze[currx+dir[i][0]][curry+dir[i][1]]!=1){
               currx = currx + dir[i][0];
               curry = curry + dir[i][1];
           }
           if(dfs(maze, new int[]{currx, curry}, destination, flag))
               return true;
       }
       return false;
   }

    //ForkJoinPool
    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean flag = solution.hasPath(new int[][]{{0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,1,0},
                {1,1,0,1,1},
                {0,0,0,0,0}
        },new int[]{0, 4},new int[]{3,2});
        System.out.println(flag);


    }

}
