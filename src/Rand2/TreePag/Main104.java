package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main104 {

    public static int maxDepth(TreeNode root) {

        return getDepth(root);
    }

    public static int getDepth(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(getDepth(root.left),getDepth(root.right));
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(maxDepth(root));
    }
}
