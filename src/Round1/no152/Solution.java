package Round1.no152;

/**
 * Created by twb on 2017/5/29.
 */

/**
 *这道题跟Maximum Subarray模型上和思路上都比较类似，还是用一维动态规划中的“局部最优和全局最优法”。
 * 这里的区别是维护一个局部最优不足以求得后面的全局最优，这是由于乘法的性质不像加法那样，累加结果只要是正的一定是递增，
 * 乘法中有可能现在看起来小的一个负数，后面跟另一个负数相乘就会得到最大的乘积。不过事实上也没有麻烦很多，我们只需要在
 * 维护一个局部最大的同时，在维护一个局部最小，这样如果下一个元素遇到负数时，就有可能与这个最小相乘得到当前最大的乘积和，
 * 这也是利用乘法的性质得到的。代码如下：
 */



public class Solution {

    public int maxProduct(int[] A) {
        if(A==null || A.length==0)
            return 0;
        if(A.length == 1)
            return A[0];
        int max_local = A[0];
        int min_local = A[0];
        int global = A[0];
        for(int i=1;i<A.length;i++)
        {
            int max_copy = max_local;
            max_local = Math.max(Math.max(A[i]*max_local, A[i]), A[i]*min_local);
            min_local = Math.min(Math.min(A[i]*max_copy, A[i]), A[i]*min_local);
            global = Math.max(global, max_local);
        }
        return global;
    }

}
