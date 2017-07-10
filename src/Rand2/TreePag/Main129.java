package TreePag;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by twb on 2017/7/8.
 */
public class Main129 {

    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        queue.add(root);
        queue1.add(root.val);
        while(queue.isEmpty()==false){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode tmp = queue.poll();
                int currVal = queue1.poll();
                if(tmp.right==null && tmp.left==null){
                    sum+=currVal;
                }
                if(tmp.left!=null){
                    queue.add(tmp.left);
                    queue1.add(currVal*10+tmp.left.val);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                    queue1.add(currVal*10+tmp.right.val);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        //root.left.right = new TreeNode(3);
     }
}
