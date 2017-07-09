package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main101 {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return helper(root.left, root.right);
    }
    public static boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left!=null &&right==null)
            return false;
        if(left==null &&right!=null)
            return false;
        if(left.val!=right.val)
            return false;
        return helper(left.left, right.right) && helper(left.right, right.left);

    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
