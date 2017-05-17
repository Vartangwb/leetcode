package no250;


/**
 * Created by twb on 2017/5/14.
 */





//采用后序遍历，先对左右子树进行访问并标记，最后对父节点进行判断
public class Solution {
    public int characterReplacement(String s, int k) {
        return 0;
    }
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    // * Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        unival(root, root.val);
        return count;
    }

    public boolean unival(TreeNode root,int pre){

        if(root == null)
            return true;
        boolean left = unival(root.left, root.val);
        boolean right = unival(root.right, root.val);
        if(left && right)
            count++;
        return (root.val == pre) && left && right;

    }




    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(5);
        System.out.println(solution.countUnivalSubtrees(treeNode));
    }

}
