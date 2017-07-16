package TreePag;

import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main255 {

    boolean verifyPreorder(int[] preorder) {
        int  k = -1, low = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for (Integer a : preorder) {
            if (a < low) return false;
            while (!s.isEmpty() && a > s.peek()) {
                low = s.peek(); s.pop();
            }
            s.push(a);
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
