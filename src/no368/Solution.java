package no368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * 思路：先将数组中的数字按照从小到大排序
 用dp[i] 表示从0到i的最大的可整除子集，那么怎么推出dp[i+1]呢，
 从i到0之间，找出第一个k(其中k属于[0,1] )满足nums[i+1]%nums[k]==0,那么有dp[i+1]=dp[k]+1,假使找不到这样的k满足以上等式，那么说明nums[i+1]只能整除自己，所以dp[i+1]=1，找到这样的k后，需要记录下k

 题目中要返回最大的长度的可整除子集中某一个最大的，要回溯，所以用一个数组pre来记录，pre[i] 表示的是以i结尾的最大可整除子集中，i的前面一个数的索引index是多少，也就是前面所提到的k。并用一个curMax来记录下遍历过程中最大的dp[i],也就是当前最大的长度，以及对应长度的子集的最后一个元素的索引idx。

 举个例子：
 pre数组元素初始化元素为-1

 例如 1 ，2 ，3, 9，10 ，15 ，27

 dp={1,2,2,3,3,3,4}

 pre={-1,0,0,2,1,2,3}

 最后计算出最大长度 curMax=4，并且idx=6，那么说明nums[6]=27 是最后一个节点，进行回溯pre[6]=3, 而pre[3]=2, pre[2]=0，pre[0]=-1那么最大的可整除子集中的元素分别为第0个，第2个，第3个，第6个
 即子集[1,3,9,27] ，长度为4

 修改： 这个思路其实是有问题的，主要是因为 在0到i之间的，也许从i-1往前找的第一个k能够使得nums[i]%nums[k]==0,但是此时如果直接得出dp[i]=dp[k]+1是不对的，也许在k之前有个s可以使得dp[s]>dp[k]。比如 [1,2,4,8,9,72], 其中8和9都可以整除72，但是dp[3]=4 而dp[4]=2,按之前的代码就会错误的得出dp[5]=3,影响curMax的最大记录。

 所以就是要找出0到i-1之间的所有能够整除nums[i]的nums[j],那么

 dp[i]=max{dp[j]+1} 其中j在[0,i-1]之间，且有nums[i]%nums[j]==0
 *
 */


/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        if(nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        Arrays.sort(nums);
        int dp[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int preIndex = -1;
        int currMax = -1;
        for(int i = 0;i<nums.length;i++){
            dp[i] = 1;
            pre[i] = -1;
        }

        for(int i = 1;i<nums.length;i++){
            for(int j = i-1;j>=0;j--){
                if(nums[i] % nums[j] == 0 && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                    pre[i] = j;
                }
            }
            if(currMax<dp[i]){
                currMax = Math.max(currMax, dp[i]);
                preIndex = i;
            }
        }

        while(true){
            if(preIndex!=-1){
                res.add(0, nums[preIndex]);
                preIndex = pre[preIndex];
            }else{
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> res = solution.largestDivisibleSubset(new int[]{1,2,4,8});
        for(int ss:res){
            System.out.println(ss);
        }
    }
}
