package Round1.no129;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        queue.add(root);
        queue1.add(root.val);
        while(queue.isEmpty()==false){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode tmp = queue.poll();
                int currVal = queue1.poll();
                if(tmp.right==null && tmp.left==null){
                    sum+=currVal;
                }
                if(tmp.left!=null){
                    queue.add(tmp.left);
                    queue1.add(currVal*10+tmp.left.val);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                    queue1.add(currVal*10+tmp.right.val);
                }
            }
        }
        return sum;
    }

}
