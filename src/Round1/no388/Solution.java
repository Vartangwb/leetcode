package Round1.no388;

import java.util.Stack;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public int lengthLongestPath(String input) {

        String tokens[] = input.split("\n");
        Stack<Integer> stc = new Stack<>();

        int res = 0;
        int currLen = 0;
        for(String str : tokens){
            int curr = getLen(str);
            while(stc.size() > curr){
                currLen-=stc.pop();
            }
            currLen+=str.replaceAll("\t","").length()+1;

            if(str.contains(".")){
                res = res>(currLen-1)?res:(currLen-1);
            }
            stc.add(str.replaceAll("\t","").length()+1);
        }
        return res;
        }

    public int getLen(String in)

    {
        return in.length() - in.replaceAll("\t","").length();
    }
    }




