package Round1.no113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        helper(root, 0,new ArrayList<>(), sum);
        return res;

    }

    public void helper(TreeNode root, int currSum, List<Integer> ls, int sum){

            ls.add(root.val);
            if(currSum+root.val>sum)
                return;
            if(root.left==null && root.right==null){
                if(currSum+ root.val == sum){
                    res.add(new ArrayList<>(ls));
                }
            }
            if(root.left!=null){
                helper(root.left, currSum+root.val, ls, sum);
            }
            if(root.right!=null){
                helper(root.right, currSum+root.val, ls, sum);
            }
            ls.remove(ls.size() - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(1);
        for(List<Integer> ls:solution.pathSum(root, 4)){
            for(Integer ll: ls){
                System.out.print(ll+" ");
            }
            System.out.println(" ");
        }
    }
}
