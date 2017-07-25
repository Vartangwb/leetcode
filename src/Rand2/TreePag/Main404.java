package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main404 {

    public static int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null)
            return 0;

        if(root.left!=null && root.left.left==null && root.left.right==null)
            sum+=root.left.val;
        System.out.println("当前计算的值是"+root.val);
        return sum+sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        sumOfLeftLeaves(root);
    }
}
