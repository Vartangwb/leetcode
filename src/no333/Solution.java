package no333;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int _val){
            this.val = _val;
        }
    }

    public int largestBSTSubtree(TreeNode root) {
            int [] res = {0};
            helper(root, res);
            return res[0];
        }

        private Node helper(TreeNode root, int [] res){
            Node cur = new Node();
            if(root == null){
                cur.isBST = true;
                return cur;
            }
            Node left = helper(root.left, res);
            Node right = helper(root.right, res);
            if(left.isBST && root.val > left.max && right.isBST && root.val < right.min){
                cur.isBST = true;
                cur.min = Math.min(root.val, left.min);
                cur.max = Math.max(root.val, right.max);
                cur.size = left.size + right.size + 1;
                if(cur.size > res[0]){
                    res[0] = cur.size;
                }
            }
            return cur;
        }
    }

    class Node{
        boolean isBST;
        int min;
        int max;
        int size;
        public Node(){
            isBST = false;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            size = 0;
        }
    }


