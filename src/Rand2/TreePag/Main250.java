package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main250 {

static int ans = 0;
    public static boolean DFS(TreeNode root, int pre){
        if(root==null)
            return true;
        boolean flagl = DFS(root.left, root.val);
        boolean flagr = DFS(root.right, root.val);
        if(flagl && flagr)
            ans++;
        return root.val == pre && flagl && flagr;
    }

    public static int countUnivalSubtrees(TreeNode root) {

        if(root==null)
            return 0;

        DFS(root, root.val);
        return ans;
    }

        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
