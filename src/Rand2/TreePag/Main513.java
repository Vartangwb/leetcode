package TreePag;

import java.util.*;

/**
 * Created by twb on 2017/7/8.
 */
public class Main513 {
    public static int findBottomLeftValue(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> ls = new ArrayList<>();
        queue.add(root);
        while(queue.isEmpty()==false){
            int size = queue.size();
            ls.clear();
            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                ls.add(curr.val);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }

        }
        return ls.get(0);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(findBottomLeftValue(root));
    }
}
