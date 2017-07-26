package TreePag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by twb on 2017/7/8.
 */
public class Main515 {
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return res;
        queue.add(root);
        while(queue.isEmpty() == false){
            int size = queue.size();
            int currMax = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode currNode = queue.poll();
                currMax = Math.max(currMax, currNode.val);
                if(currNode.left != null)
                    queue.add(currNode.left);
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
            res.add(currMax);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(largestValues(root));
    }
}
