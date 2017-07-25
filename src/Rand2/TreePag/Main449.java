package TreePag;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/7/8.
 */
public class Main449 {

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
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

    }
}
