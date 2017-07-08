package StrString;

import sun.reflect.generics.tree.Tree;

/**
 * Created by twb on 2017/7/1.
 */
public class Main606 {

    public static String tree2str(TreeNode t) {
        String res = helper(t);
        return res;
    }
    public static String helper(TreeNode t){

            if (t == null) return "";

            String result = t.val + "";

            String left = helper(t.left);
            String right = helper(t.right);

            if (left == "" && right == "") return result;
            if (left == "") return result + "()" + "(" + right + ")";
            if (right == "") return result + "(" + left + ")";
            return result + "(" + left + ")" + "(" + right + ")";

    }
    public static void main(String[] args) {
        TreeNode rppt = new TreeNode(0);
        rppt.left = new TreeNode(1);
        rppt.right = new TreeNode(2);
        System.out.println(tree2str(rppt));
        //System.out.println(str2tree("3(4)(2)").left.val);

        //System.out.println(str2tree("3(4)(2)").right.val);
    }

}

