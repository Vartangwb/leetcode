package no236;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int _val){
            this.val = _val;
        }

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }

}
