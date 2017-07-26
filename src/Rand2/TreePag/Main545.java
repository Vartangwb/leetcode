package TreePag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        LinkedList<Integer> left = new LinkedList<>();
        left.add(root.val);

        if (root.left != null) {
            leftDFS(root.left, left);
            left.remove(left.size() - 1);
        }

        leavesDFS(root.left, left);
        leavesDFS(root.right, left);

        LinkedList<Integer> right = new LinkedList<>();
        rightDFS(root.right, right);

        for (int i = 1; i < right.size(); i++) {
            left.add(right.get(i));
        }

        return left;
    }



    private void leftDFS(TreeNode root, LinkedList<Integer> left) {
        left.add(root.val);

        if (root.left == null && root.right == null)
            return;

        if (root.left != null) {
            leftDFS(root.left, left);
        } else if (root.right != null) {
            leftDFS(root.right, left);
        }
    }

    private void rightDFS(TreeNode root, LinkedList<Integer> right) {
        if (root == null)
            return;

        right.addFirst(root.val);

        if (root.left == null && root.right == null)
            return;

        if (root.right != null) {
            rightDFS(root.right, right);
        }

        else if (root.left != null) {
            rightDFS(root.left, right);
        }
    }

    private void leavesDFS(TreeNode root, LinkedList<Integer> leaves) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        }

        leavesDFS(root.left, leaves);
        leavesDFS(root.right, leaves);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        Main545 main545 = new Main545();
        System.out.println(main545.boundaryOfBinaryTree(root));
    }
}
