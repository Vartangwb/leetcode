package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main543 {
    static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {

        getDepth1(root);
        return max;
    }
    public static int getDepth1(TreeNode root){
        if(root == null)
            return 0;
        int left = getDepth1(root.left);
        int right = getDepth1(root.right);
        max = Math.max(max,left + right);
        return 1 + Math.max(left,right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(diameterOfBinaryTree(root));
    }
}
