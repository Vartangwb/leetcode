package TreePag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by twb on 2017/7/8.
 */
public class Main538 {
    static int sum = 0;
    public static TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    public static void convert(TreeNode root){
        if(root == null)
            return;
        convert(root.right);
        sum+=root.val;
        root.val = sum;
        convert(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(convertBST(root).val);
    }
}
