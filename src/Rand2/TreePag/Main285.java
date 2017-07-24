package TreePag;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main285 {

    TreeNode  inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode ans = null;
        if(root==null || p==null)
            return null;
        while(root!=null) {
            if (root.val > p.val) {
                {
                    ans = root;
                    root = root.left;
                }
            } else {
                root = root.right;
            }
        }
        return ans;
    }

        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        //System.out.println(closestKValues(root,1,5));
    }
}
