package TreePag;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main173 {

    public class BSTIterator {

        Stack<TreeNode> stc;
        public BSTIterator(TreeNode root) {
            stc = new Stack<TreeNode>();
            while(root!=null){
                stc.push(root);
                root = root.left;
            }
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            if(stc.isEmpty() == false)
                return true;
            return false;
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode tmp = stc.pop();
            int val = tmp.val;
            TreeNode rig = tmp.right;
            if(rig!=null){
                while(rig!=null){
                    stc.push(rig);
                    rig = rig.left;
                }
            }
            return val;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
