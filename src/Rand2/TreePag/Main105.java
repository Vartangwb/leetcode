package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main105 {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0,preorder.length-1, 0, inorder.length-1);
    }
    public static TreeNode helper(int[] preorder, int[] inorder, int p_left, int p_right, int i_left, int i_right){
        if(p_right<p_left)
            return null;
        if(i_right<i_left)
            return null;
        TreeNode root = new TreeNode(preorder[p_left]);
        int index = -1;
        for(int i = i_left;i<=i_right;i++){
            if(inorder[i]==preorder[p_left]){
                index = i;
                break;
            }
        }
        System.out.println(index);
        root.left = helper(preorder, inorder, p_left+1, index+p_left-i_left, i_left, index-1);
        root.right = helper(preorder, inorder, p_left+index+1-i_left, p_right, index+1, i_right);
        return root;
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(buildTree(new int[]{1,2,3,4},new int[]{2,3,4,5}));
    }
}
