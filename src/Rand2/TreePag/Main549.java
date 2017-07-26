package TreePag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main549 {
    int longestConsecutive(TreeNode root){
        if(root == null)
            return 0;
        int res = getDiff(root, 1) + getDiff(root, -1) + 1;
        return Math.max(Math.max(res, longestConsecutive(root.left)), longestConsecutive(root.right));
    }

    public int getDiff(TreeNode root, int diff){
        if(root == null)
            return 0;
        int dic = 0;
        int ran = 0;
        if(root.left!=null && root.val - root.left.val == diff){
            dic = getDiff(root.left, diff) + 1;
        }
        if(root.right!=null && root.val - root.right.val == diff){
            ran = getDiff(root.right, diff) + 1;
        }
        return Math.max(ran, dic);
    }
    int res = 0;
    public void getDiff11(TreeNode root, int len){
        if(len>res)
            res = len;
        if(root.left!=null){
            if(root.left.val - root.val == 1){
                getDiff11(root.left, len + 1);
            }else{
                getDiff(root.left, 1);
            }
        }
        if(root.right!=null){
            if(root.right.val - root.val == 1){
                getDiff11(root.right, len + 1);
            }else{
                getDiff(root.right, 1);
            }
        }
    }

    int longestConsecutiveII(TreeNode root) {
        if(root == null)
            return 0;
        getDiff11(root,1);
        return res;//Math.max(Math.max(res, longestConsecutiveII(root.left)), longestConsecutiveII(root.right));

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        Main549 main545 = new Main549();
        System.out.println(main545.longestConsecutive(root));
    }
}
