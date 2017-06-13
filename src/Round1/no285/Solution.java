package Round1.no285;

/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

    public static class TreeNode{
        TreeNode left,right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        if(p.right!=null){
            return findLeftMostNode(p.right);
        }
        TreeNode sucer = null;
        while(root!=null){
            if(p.val < root.val){
                sucer = root;
                root = root.left;
            }else if(p.val > root.val){
                root = root.right;
            }else{
                break;
            }
        }
        return sucer;
    }
    TreeNode findLeftMostNode(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
        return root
                ;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();

        //solution.inorderSuccessor()
    }
}
