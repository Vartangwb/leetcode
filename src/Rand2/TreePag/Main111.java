package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main111 {

     public static int minDepth(TreeNode root) {
         if(root==null)
             return 0;
         return getDepth(root);
     }
     public static int getDepth(TreeNode root){
         if(root == null)
             return 0;
         if(root.left==null && root.right==null)
             return 1;
         if(root.left!=null && root.right==null)
             return getDepth(root.left)+1;
         if(root.left==null && root.right!=null)
             return getDepth(root.right)+1;
         return Math.min(getDepth(root.left),getDepth(root.right))+1;
     }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(minDepth(root));
    }
}
