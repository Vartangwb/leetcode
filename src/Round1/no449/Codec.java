package Round1.no449;

/**
 * Created by twb on 2017/5/16.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        if(root == null){
            return "#!";
        }
        return root.val + "!" + serialize(root.left) + serialize(root.right);
    }




    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[] = data.split("!");
        if(arr[0].equals("#"))
            return null;
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            queue.add(arr[i]);
        }
        return reConstruct(queue);
    }

    public TreeNode reConstruct(Queue<String> queue){
        String val = queue.poll();
        if(val.equals("#")){
            return null;
        }
        int vall = Integer.valueOf(val);
        TreeNode root = new TreeNode(vall);
        root.left = reConstruct(queue);
        root.right = reConstruct(queue);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Codec codec = new Codec();
        System.out.println(codec.serialize(root));
        //codec.deserialize(codec.serialize(root))
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));