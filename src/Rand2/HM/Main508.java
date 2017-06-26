package HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/6/19.
 */
public class Main508 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        helper1(root, hm);
        int i = 0;
        int currNum = 0;
        for (int ii : hm.keySet()) {
            if (i == 0) {
                currNum = hm.get(ii);
                ls.add(ii);
                i++;
            } else {
                int num = hm.get(ii);
                if (num > currNum) {
                    ls.clear();
                    ls.add(ii);
                    currNum = num;
                } else if (currNum == num) {
                    ls.add(ii);

                }

            }
        }
        int[] ss = new int[ls.size()];
        for (int j = 0; j < ls.size(); j++) {
            ss[j] = ls.get(j);
        }
        return ss;
    }

    //int sum = 0;
    public static int helper1(TreeNode root, Map<Integer, Integer> hm) {
        if (root == null)
            return 0;

        int sum1 = helper1(root.left, hm);
        int sum2 = helper1(root.right, hm);
        int sum = sum1 + sum2 + root.val;
        root.val = sum;
        if (hm.containsKey(root.val)) {
            hm.put(root.val, hm.get(root.val) + 1);
        } else {
            hm.put(root.val, 1);
        }
        return sum;
    }


    public static void main(String[] args) {


        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(-1);
        treeNode.right = new TreeNode(1);
        System.out.println(Main508.findFrequentTreeSum(treeNode));
    }
}



