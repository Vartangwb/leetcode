package no095;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int _val){
            this.val = _val;
        }
    }


    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        res = helper(1,n);
        return res;
    }

    public List<TreeNode> helper(int start, int end){

        List<TreeNode> arr = new ArrayList<>();
        if(start>end) {
            arr.add(null);
            return arr;
        }
        if(start == end){
            arr.add(new TreeNode(start));
            return arr;
        }
        for(int i = start;i<=end;i++){
            List<TreeNode> left = helper(start, i-1);
            List<TreeNode> right = helper(i+1, end);
            for(TreeNode ll:left){
                for(TreeNode rr:right){
                    TreeNode root = new TreeNode(i);
                    root.left = ll;
                    root.right = rr;
                    arr.add(root);
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateTrees(3);
    }

}
