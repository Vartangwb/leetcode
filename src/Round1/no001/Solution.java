package Round1.no001;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int max = 0;
    public int longestConsecutive(TreeNode root) {
        dfs(root, 1, root.val);
        return max;
    }

    public void dfs(TreeNode root,int currCount,int preVal){
        if(root == null){
            return ;
        }
        max = Math.max(currCount, max);
        if(root.left!=null){
            if(root.left.val == preVal+1){
                dfs(root.left,currCount+1,root.left.val);
            }else{
                dfs(root.left,1,root.left.val);
            }
        }
        if(root.right!=null){
            if(root.right.val == preVal+1){
                dfs(root.right,currCount+1,root.right.val);
            }else{
                dfs(root.right,1,root.right.val);
            }
        }

    }



        public static void main(String[] args) {

        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
            System.out.println(solution.longestConsecutive(root));
    }

}
