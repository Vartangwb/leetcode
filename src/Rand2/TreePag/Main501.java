package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main501 {

    static int maxCount = 0;
    static int currCount = 0;
    static int currVal = 0;
    public static int[] findMode(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        inorder(root, ls);
        int arr[] = new int[ls.size()];
        for(int i = 0;i<ls.size();i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
    public static void helper(int root_val,List<Integer> ls){
        if(root_val != currVal){
            currCount = 1;
            currVal = root_val;
        }else{
            currCount++;
        }
        if(currCount>maxCount){
            maxCount = currCount;
            currVal = root_val;
            ls.clear();
            ls.add(currVal);
        }else if(currCount==maxCount){
            ls.add(currVal);
        }
    }
    public static void inorder(TreeNode root,List<Integer> ls){
        if(root == null)
            return ;
        inorder(root.left,ls);
        helper(root.val, ls);
        inorder(root.right,ls);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(findMode(root).length);
    }
}
