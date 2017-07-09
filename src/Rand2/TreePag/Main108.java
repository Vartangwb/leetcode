package TreePag;

import java.util.*;

/**
 * Created by twb on 2017/7/8.
 */
public class Main108 {

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length<1)
            return null;
        return buildTree(nums,0,nums.length-1);
    }
    public static TreeNode buildTree(int[] nums, int left, int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root =new TreeNode(nums[mid]);
        root.left = buildTree(nums,left,mid-1);
        root.right = buildTree(nums,mid+1,right);
        return root;
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(sortedArrayToBST(new int[]{2,3,4,5}));
    }
}
