package no087;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int lenx = board.length;
        int leny = board[0].length;
        visited = new boolean[board.length][board[0].length];
        for(int i = 0;i < lenx;i++){
            for(int j = 0; j < leny;j++){
                if(helperExist(board,i,j,word,0))
                    return true;
            }
        }
        return false;
    }
    public boolean helperExist(char[][] board,int currx,int curry,String word,int index){
        if(index==word.length())
            return true;
        if( currx>=board.length || currx<0 || curry>=board[0].length || curry<0 || visited[currx][curry]==true || board[currx][curry] != word.charAt(index))
            return false;
        visited[currx][curry] = true;
        boolean flag = helperExist(board,currx+1,curry,word,index+1) ||
                helperExist(board,currx-1,curry,word,index+1) ||
                helperExist(board,currx,curry+1,word,index+1)||
                helperExist(board,currx,curry-1,word,index+1);
        if(flag)
            return true;
        visited[currx][curry] = false;
        return false;
    }

}
