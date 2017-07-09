package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main096 {

    public static int numTrees(int n) {

        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2;i<=n;i++){
            for(int j = 0;j<i;j++){
                dp[i]+= dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(numTrees(3));
    }
}
