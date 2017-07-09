package TreePag;

import java.util.*;

/**
 * Created by twb on 2017/7/8.
 */
public class Main107 {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<List<Integer>> stcHelper = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.offer(root);
        while (queue.isEmpty() == false) {
            int size = queue.size();
            List<Integer> ls = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                ls.add(currNode.val);
                if (currNode.left != null)
                    queue.offer(currNode.left);
                if (currNode.right != null)
                    queue.offer(currNode.right);
            }
            stcHelper.add(ls);
        }
        while (stcHelper.isEmpty() == false) {
            res.add(stcHelper.pop());
        }
        return res;
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(levelOrderBottom(root));
    }
}
