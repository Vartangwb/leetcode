package no337;


import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }
   public static class TreeNode {
       TreeNode left;
       TreeNode right;
       int val;

       TreeNode(int _val){
           this.val = _val;
       }
   }
    public int rob(TreeNode root) {
       Map<TreeNode, Integer> hm = new HashMap<>();
       return helper(root, hm);
    }
    public int helper(TreeNode root, Map<TreeNode, Integer> hm){
        if(root == null)
            return 0;
        if(hm.containsKey(root))
            return hm.get(root);
        int val = 0;
        if(root.left!=null){
            val+=rob(root.left.left)+rob(root.left.right);
        }
        if(root.right!=null){
            val+=rob(root.right.left)+rob(root.right.right);
        }

        val = Math.max(root.val+val,rob(root.left)+rob(root.right));
        hm.put(root, val);
        return val;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int val = solution.rob(root);
        System.out.println(val);
    }

}
