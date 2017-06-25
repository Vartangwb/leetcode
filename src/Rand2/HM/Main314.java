package HM;

import java.util.*;

/**
 * Created by twb on 2017/6/19.
 */
public class Main314 {


    public static class TreeNode {

        TreeNode left,right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static class TreeNodeIndex{
        TreeNode root;
        int val;

        public TreeNodeIndex(TreeNode root, int val) {
            this.root = root;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> hm = new HashMap<>();
        Queue<TreeNodeIndex> queue = new LinkedList<>();
        queue.add(new TreeNodeIndex(root, 0));
        int max = 0;
        int min = 0;
        while(queue.isEmpty() == false){

            int size = queue.size();
            //System.out.println(size);
            for(int i = 0;i<size;i++){

                TreeNodeIndex tmp = queue.poll();
                //System.out.println(tmp.root.val);
                if(hm.containsKey(tmp.val)){
                    hm.get(tmp.val).add(tmp.root.val);
                }else{
                    hm.put(tmp.val, new ArrayList<>());
                    hm.get(tmp.val).add(tmp.root.val);
                }

                if(tmp.root.left!=null){
                    //          System.out.println("+"+tmp.root.left.val);
                    queue.add(new TreeNodeIndex(tmp.root.left, tmp.val - 1));
                    min = Math.min(min, tmp.val-1);
                }
                if(tmp.root.right!=null){
                    queue.add(new TreeNodeIndex(tmp.root.right, tmp.val + 1));
                    max = Math.max(max, tmp.val+1);
                }
            }
        }

        for(int kk = min;kk<=max;kk++){
            System.out.print(hm.get(kk)+" ");
            res.add(hm.get(kk));
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Main314 solution = new Main314();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        solution.verticalOrder(root);
    }



}