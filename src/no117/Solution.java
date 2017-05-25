package no117;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {


    public static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }

    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.isEmpty() == false){

            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeLinkNode curr = null;

                curr = queue.poll();
                curr.next = (i == size - 1)?null:queue.peek();
                if(curr.left != null)
                    queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);

            }

        }

    }

}
