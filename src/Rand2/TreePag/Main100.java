package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null)
            return true;
        else if(p==null && q!=null || p!=null && q==null)
            return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(isSameTree(root,root));
    }
}
