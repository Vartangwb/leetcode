package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main112 {

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if(root.left==null && root.right==null && root.val==sum)
            return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(hasPathSum(root, 2));
    }
}
