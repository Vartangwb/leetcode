package Round1.no230;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int _val){
            this.val = _val;
        }
    }
    int __val = 0;
    Integer _count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderTrans(root,k);
        return __val;
    }
    public void inorderTrans(TreeNode root,int k){
        if(root == null)
            return;
        inorderTrans(root.left,k);
        _count++;
        if(_count == k)
            __val = root.val;
        inorderTrans(root.right, k);

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        System.out.println(solution.kthSmallest(root,1));
    }

}
