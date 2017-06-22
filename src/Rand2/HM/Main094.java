package HM;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/6/19.
 */
public class Main094 {



    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ls = new ArrayList<Integer>();
        Stack<TreeNode> stc = new Stack<>();
        if(root == null)
            return ls;
        while(stc.isEmpty()==false || root!=null){
            while(root!=null){
                stc.add(root);
                root = root.left;
            }
            TreeNode tmp = stc.pop();
            ls.add(tmp.val);
            root = tmp.right;
        }
        return ls;
    }

    public static void main(String[] args) {

    }

}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int _val){
        this.val = _val;
    }

}
