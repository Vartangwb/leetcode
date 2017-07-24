package TreePag;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main257 {

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root==null)
            return res;
        helper(root,res,"" );
        return res;
    }

    public static void helper
            (TreeNode root, List<String> res, String str){
        if(root == null)
            return ;
        if(root.left==null && root.right == null)
            res.add(str+root.val+"");
        if(root.left!=null){
            helper(root.left, res, str + root.val +"->");
        }if(root.right!=null){
            helper(root.right, res, str + root.val + "->");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(binaryTreePaths(root));
    }
}
