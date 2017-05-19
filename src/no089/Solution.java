package no089;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/19.
 */

/**
 * 可以发现，n的格雷码，就是n-1的格雷码，再加上它们的逆序前面多一个1。
 * 时间 O(N) 空间 O(N)
 */
public class Solution {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        // 加入初始值0
        res.add(0);
        for(int i = 0; i < n; i++){
            // 每一轮的最高位
            int highestBit = 1 << i;
            int size = res.size();
            // 逆序添加上一轮里出现的数，不过开头加上这一轮的最高位
            for(int j = size - 1; j >= 0; j--){
                int num = res.get(j);
                num += highestBit;
                res.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> res = solution.grayCode(3);
        for(int i:res){
            System.out.println(i);
        }
    }
}
