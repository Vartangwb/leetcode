package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main098 {

    static List<Integer> list = new ArrayList<Integer>();

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        inOrderTraversal(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(isValidBST(root));
    }
}
