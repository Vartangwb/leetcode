package TreePag;

/**
 * Created by twb on 2017/7/8.
 */
public class Main106 {

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int len1 = inorder.length-1;

        if(len1==-1)
            return null;
        return helperBuilder(0,len1,0,len1,inorder,postorder);

    }
    public static TreeNode helperBuilder(int left1,int left2,int right1,int right2,int[] inorder,int[]postorder){
        if(right2<right1)
            return null;
        if(left1>left2)
            return null;
        int num = postorder[right2];
        TreeNode root = new TreeNode(num);
        int pos = 0;
        for(int i=left1;i<=left2;i++){
            if(inorder[i] == num){
                pos = i;
                break;
            }
        }
        root.left = helperBuilder(left1,pos-1,right1,right1+pos-1-left1,inorder,postorder);
        root.right = helperBuilder(pos+1,left2,right1+pos-left1,right2-1,inorder,postorder);
        return root;
    }
        public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        //root.left.right = new TreeNode(3);
        System.out.println(buildTree(new int[]{1,2,3,4},new int[]{2,3,4,5}));
    }
}
