package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main226 {

    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    public TreeNode helper(TreeNode root){
        if(root == null)
            return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left!=null)
            root.left = helper(root.left);
        if(root.right!=null)
            root.right = helper(root.right);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
