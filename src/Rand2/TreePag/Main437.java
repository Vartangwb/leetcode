package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main437 {

    public static int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return getNum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public static int getNum(TreeNode root, int sum){
        if(root == null)
            return 0;
        int res = 0;
        if(root.val == sum)
            res++;
        System.out.println("当前计算的值是"+root.val);
        res+=getNum(root.left, sum-root.val);
        res+=getNum(root.right, sum-root.val);
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        pathSum(root, 3);
    }
}
