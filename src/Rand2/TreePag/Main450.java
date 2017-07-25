package TreePag;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/7/8.
 */
public class Main450 {

    public static TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return null;

        }
        if(root.val == key){
            if(root.right==null){
                return root.left;
            }else{
                TreeNode curr = root.right;
                while(curr.left!=null){
                    curr = curr.left;
                }
                int tmp = curr.val;
                curr.val = root.val;
                root.val = tmp;
            }
        }
        root.left = deleteNode(root.left,key);
        root.right = deleteNode(root.right, key);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        deleteNode(root, 2);
    }
}
