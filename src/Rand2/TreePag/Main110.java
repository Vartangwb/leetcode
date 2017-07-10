package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main110 {

    public static boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public static int getHeight(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
