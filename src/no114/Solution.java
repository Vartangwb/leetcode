package no114;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void flatten(TreeNode root) {
        TreeNode now = root;
        while(now!=null){
            if(now.left != null){
                TreeNode tmp = now.left;
                while(tmp.right!=null){
                    tmp = tmp.right;
                }
                tmp.right = now.right;
                now.right = now.left;
                now.left = null;

            }
            now = now.right;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution.flatten();
    }
}
