package TreePag;

import static java.lang.Math.max;

/**
 * Created by twb on 2017/7/8.
 */
public class Main298 {

    static int longestConsecutive(TreeNode root) {
        return helper(root, null, 0);
    }
    public static int helper(TreeNode root, TreeNode pre, int res){
        if (root==null) return res;
        res = (pre!=null && root.val == pre.val + 1) ? res + 1 : 1;
        return max(res, max(helper(root.left, root, res), helper(root.right, root, res)));

    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        System.out.println(longestConsecutive(root));
    }
}
