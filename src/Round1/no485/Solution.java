package Round1.no485;

/**
 * 在此时递归就体现了其优越性, 因为递归是可以回溯的, 所以不需要记录父节点. 然后考虑删除以后节点的替换. 有四种替换方式:

 1. 如果要删除的节点有左孩子, 则可以直接让左孩子替换其位置, 并且让左孩子的右子树连接到要删除节点的右孩子的最左端

 2. 如果要删除的节点有右孩子, 则可以让右孩子替换其位置, 并且让右孩子的左子树连接到要删除节点的左孩子的最右端

 3. 如果要删除的节点有左孩子, 则可以取左孩子的最右节点替换要删除的节点

 4. 如果要删除的节点有右孩子, 则可以去右孩子的最左节点替换要删除的节点.
 */


/**
 * Created by twb on 2017/5/24.
 */
public class Solution {

     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public TreeNode deleteNode(TreeNode root, int key) {

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

}
