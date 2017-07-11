package TreePag;

import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main230 {


    public int kthSmallest1(TreeNode root,int k){
        if(root==null)
            return 0;
        Stack<TreeNode> stc = new Stack<TreeNode>();
        TreeNode curr = root;
        int currnum = 0;
        int res = 0;
        while(curr!=null || stc.isEmpty()==false){
            while(curr!=null){
                stc.push(curr);
                curr = curr.left;
            }

            curr = stc.pop();
            currnum++;
            if(currnum==k){
                res = curr.val;

            }
            curr = curr.right;

        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
