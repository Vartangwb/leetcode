package Round1.no549;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {


    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    int longestConsecutive(TreeNode root){
        if(root == null)
            return 0;
        int res = getDiff(root, 1) + getDiff(root, -1);
        return Math.max(Math.max(res, longestConsecutive(root.left)), longestConsecutive(root.right));
    }

    public int getDiff(TreeNode root, int diff){
        if(root == null)
            return 0;
        int dic = 0;
        int ran = 0;
        if(root.left!=null && root.val - root.left.val == diff){
            dic = getDiff(root.left, diff) + 1;
        }
        if(root.right!=null && root.val - root.right.val == diff){
            ran = getDiff(root.right, diff) + 1;
        }
        return Math.max(ran, dic);
    }
    int res = 0;
    public void getDiff11(TreeNode root, int len){
        if(len>res)
            res = len;
        if(root.left!=null){
            if(root.left.val - root.val == 1){
                getDiff11(root.left, len + 1);
            }else{
                getDiff(root.left, 1);
            }
        }
        if(root.right!=null){
            if(root.right.val - root.val == 1){
                getDiff11(root.right, len + 1);
            }else{
                getDiff(root.right, 1);
            }
        }
    }

    int longestConsecutiveII(TreeNode root) {
        if(root == null)
            return 0;
        getDiff11(root,1);
        return res;//Math.max(Math.max(res, longestConsecutiveII(root.left)), longestConsecutiveII(root.right));

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(4);
        System.out.println(solution.longestConsecutiveII(root));
    }
}
