package TreePag;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main094 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> stc = new Stack<>();
        if(root == null)
            return ls;
        while(!stc.isEmpty() || root!=null){
            while(root!=null){
                stc.add(root);
                root = root.left;
            }
            TreeNode tmp = stc.pop();
            ls.add(tmp.val);
            root = tmp.right;
        }
        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}