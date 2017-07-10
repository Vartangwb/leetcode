package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main113 {

    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {

        helper(root, 0,new ArrayList<>(), sum);
        return res;

    }

    public static void helper(TreeNode root, int currSum, List<Integer> ls, int sum){

        if(root == null)
            return;
        ls.add(root.val);
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
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(pathSum(root, 2));
    }
}
