package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main366 {

    private static int depth(TreeNode node) {
        if (node == null) return 0;
        int depth = 1;
        int left = depth(node.left);
        int right = depth(node.right);
        depth += Math.max(left, right);
        return depth;
    }

    private static int depth(TreeNode node, List<List<Integer>> results) {
        if (node == null) return 0;
        int depth = 1;
        int left = depth(node.left, results);
        int right = depth(node.right, results);
        depth += Math.max(left, right);
        results.get(depth - 1).add(node.val);
        return depth;
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        int depth = depth(root);
        List<List<Integer>> results = new ArrayList<>(depth);
        for(int i = 0; i < depth; i++) {
            results.add(new ArrayList<>());
        }
        depth(root, results);
        return results;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

    }
}
