package New_File;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by twb on 2017/5/31.
 */
public class PostOrder {

    public void postOrder(TreeNode root){
        TreeNode pre = null;
        Stack<TreeNode> stc = new Stack<>();
        stc.push(root);
        while(stc.isEmpty() == false){
            TreeNode tmp = stc.peek();

            if((tmp.left==null && tmp.right==null) || (pre!=null &&(pre == tmp.left || pre == tmp.right))){
                System.out.println(tmp.val);
                stc.pop();
                pre = tmp;
            }else{
                if(tmp.right!=null){
                    stc.push(tmp.right);
                }
                if(tmp.left!=null){
                    stc.push(tmp.left);
                }
            }
        }
    }

    public void preOrder(TreeNode root){

        Stack<TreeNode> stc = new Stack<>();
        stc.push(root);
        while(stc.isEmpty()==false){
            TreeNode tmp = stc.pop();
            if(tmp.right!=null){
                stc.push(tmp.right);

            }
            if(tmp.left!=null){
                stc.push(tmp.left);
            }
            System.out.println(tmp.val);
        }

    }

    public void inOrder(TreeNode root){

        Stack<TreeNode> stc = new Stack<>();

        while(stc.isEmpty() == false || root!=null){
            while(root != null){
                stc.push(root);
                root = root.left;
            }
            TreeNode tmp = stc.pop();
            System.out.println(tmp.val);
            root = tmp.right;
        }

    }


    public static void main(String[] args) {
        PostOrder postOrder = new PostOrder();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        postOrder.inOrder(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
