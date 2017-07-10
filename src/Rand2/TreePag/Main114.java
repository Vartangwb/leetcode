package TreePag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twb on 2017/7/8.
 */
public class Main114 {

    public static void flatten(TreeNode root) {
        TreeNode now = root;
        while(now!=null){
            if(now.left!=null){
                TreeNode tmp = now.left;
                while(tmp.right!=null){
                    tmp = tmp.right;
                }
                tmp.right = now.right;
                now.right = now.left;
                now.left = null;
            }
            now = now.right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
