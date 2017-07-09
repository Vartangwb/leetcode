package TreePag;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by twb on 2017/7/8.
 */
public class Main095 {

    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<>();
        if(n == 0)
            return res;
        res = helper(1,n);
        return res;
    }

    public static List<TreeNode> helper(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end) {
            res.add(null);
            return res;
        }
        if(start==end) {
            res.add(new TreeNode(start));
            return res;
        }
        for(int i = start;i<=end;i++){
            List<TreeNode> left = helper(start, i-1);
            List<TreeNode> right = helper(i+1, end);
            for(TreeNode l:left)
                for(TreeNode r:right){

                   TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);

                }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(generateTrees(3));
    }
}
