package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/6/7.
 */
public class Main079 {

    int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public static boolean exist(char[][] board, String word) {
        int lenx = board.length;
        int leny = board[0].length;
        boolean visited[][] = new boolean[lenx][leny];
        for(int i = 0;i < lenx;i++){
            for(int j = 0; j < leny;j++){
                if(helper(board,word,0,visited,i,j))
                    return true;
            }
        }
        return false;

    }
    public static boolean helper(char[][] board, String word, int index, boolean[][] visited, int x, int y){

        if(index == word.length())
            return true;
        if(isValid(x, y, board, visited)==false)
            return false;
        if(board[x][y]!=word.charAt(index)){
            return false;
        }
        visited[x][y] = true;
        boolean flag = helper(board, word, index+1, visited, x+1,y) || helper(board, word, index+1, visited, x-1,y) ||
                helper(board, word, index+1, visited, x,y+1) || helper(board, word, index+1, visited, x,y-1);
        if(flag==true)
            return true;
        visited[x][y] = false;
        return false;


    }
    public static boolean isValid(int x, int y, char[][] board,boolean[][] visited){
        if(x>=0 && x<board.length && y>=0 && y<board[0].length && visited[x][y]==false)
            return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(exist(new char[][]{{},{}},""));
    }
}
