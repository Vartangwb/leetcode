package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main270 {

    public static int closestValue(TreeNode root, double target) {

        int closest = root.val;
        double min = Double.MAX_VALUE;

        while(root!=null) {
            if( Math.abs(root.val - target) < min  ) {
                min = Math.abs(root.val - target);
                closest = root.val;
            }

            if(target < root.val) {
                root = root.left;
            } else if(target > root.val) {
                root = root.right;
            } else {
                return root.val;
            }
        }

        return closest;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(closestValue(root,1));
    }
}
