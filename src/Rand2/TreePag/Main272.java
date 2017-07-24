package TreePag;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main272 {

        public static List<Integer> closestKValues(TreeNode root, double target, int k) {
            LinkedList<Integer> res = new LinkedList<>();
            inOrderTraversal(root, target, k, res);
            return res;
        }

        private static void inOrderTraversal(TreeNode root, double target, int k, LinkedList<Integer> res) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left, target, k, res);
            if (res.size() < k) {
                res.add(root.val);
            } else if(res.size() == k) {
                if (Math.abs(res.getFirst() - target) > (Math.abs(root.val - target))) {
                    res.removeFirst();
                    res.addLast(root.val);
                } else {
                    return;
                }
            }
            inOrderTraversal(root.right, target, k, res);
        }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(closestKValues(root,1,5));
    }
}
