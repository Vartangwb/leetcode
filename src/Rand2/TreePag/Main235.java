package TreePag;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main235 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> ls1 = new ArrayList<>();
        List<TreeNode> ls2 = new ArrayList<>();

        ls1.add(root);
        ls2.add(root);
        getpath(ls1, root, p);
        getpath(ls2, root ,q);
        TreeNode lsc = new TreeNode(0);
        for(int i=0;i<ls1.size() && i<ls2.size();i++){
            if(ls1.get(i)==ls2.get(i))
                lsc = ls1.get(i);
            else
                break;
        }
        return lsc;
    }
    public static boolean getpath(List<TreeNode> ls, TreeNode root, TreeNode r){
        if(root == r)
            return true;
        if(root.left!=null){
            ls.add(root.left);
            if(getpath(ls, root.left, r))
                return true;
            ls.remove(ls.size()-1);
        }

        if(root.right!=null){
            ls.add(root.right);
            if(getpath(ls, root.right, r))
                return true;
            ls.remove(ls.size()-1);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
