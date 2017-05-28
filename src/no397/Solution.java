package no397;

/**
 * Created by twb on 2017/5/27.
 */

/*

对于7来说，加1和减1的结果相同，我们可以不用管，对于3来说，减1的步骤小，所以我们需要去掉这种情况。
那么我们如何知道某个数字加1后是否是4的倍数呢，我们可以用个小技巧，由于我们之前判定其是奇数了，
那么最右边一位肯定是1，如果其右边第二位也是1的话，那么进行加1运算，进位后右边肯定会出现两个0，
则一定是4的倍数，搞定。如果之前判定是偶数，那么除以2即可，参见代码如下：
 */

public class Solution {

    public int integerReplacement(int n) {
        int cut= 0;
        long t = n;
        while(t>1){
            cut++;
            if((t&1)==1){
                if((t&2)!=0 && (t!=3)){
                    t++;
                }else{
                    t--;
                }
            }else{
                t>>=1;
            }
        }
        return cut;
    }

}
