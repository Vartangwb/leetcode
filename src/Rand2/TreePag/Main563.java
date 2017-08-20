package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main563 {
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        int sum = 0;
        sum = sum + Math.abs(getSum(root.left)-getSum(root.right));
        sum += findTilt(root.left) + findTilt(root.right);
        return sum;
    }
    public int getSum(TreeNode root){
        if(root==null)
            return 0;
        return getSum(root.left) + getSum(root.right) + root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        Main563 main545 = new Main563();
        System.out.println(main545.findTilt(root));
    }
}
