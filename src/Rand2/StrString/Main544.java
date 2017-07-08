package StrString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by twb on 2017/7/1.
 */
public class Main544 {


    public static String findContestMatch(int n) {
        List<String>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(String.valueOf(i));
        }
        List<String> res = doAdd(list, n);
        return res.get(0);
    }
    public static List<String> doAdd(List<String> ls, int n){
        if(n<=1)
            return ls;
        List<String>ans=new ArrayList<>();
        int mid = n/2;
        int end = n-1;
        for(int i = 0;i<mid;i++){
            ans.add("("+ls.get(i)+","+ls.get(end-i)+")");
        }
        return doAdd(ans,mid);
    }

    public static void main(String[] args) {
            System.out.println(findContestMatch(8));
    }

}
