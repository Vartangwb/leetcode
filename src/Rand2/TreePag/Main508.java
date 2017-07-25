package TreePag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by twb on 2017/7/8.
 */
public class Main508 {

    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        helper1(root, hm);
        int i = 0;
        int currNum = 0;
        for(int ii:hm.keySet()){
            if(i==0){
                currNum = hm.get(ii);
                ls.add(ii);
                i++;
            }else{
                int num = hm.get(ii);
                if(num>currNum){
                    ls.clear();
                    ls.add(ii);
                    currNum = num;
                }else if(currNum == num){
                    ls.add(ii);

                }

            }
        }
        System.out.println(ls);
        int[] ss = new int[ls.size()];
        for(int j = 0;j<ls.size();j++){
            ss[j] = ls.get(j);
        }
        return ss;
    }
    //int sum = 0;
    public int helper1(TreeNode root, Map<Integer, Integer> hm){
        if(root == null)
            return 0;

        int sum1 = helper1(root.left, hm);
        int sum2 = helper1(root.right, hm);
        int sum = sum1+sum2+root.val;
        //root.val = sum;
        System.out.println("root"+root.val);
        if(hm.containsKey(sum)){
            hm.put(sum, hm.get(sum)+1);
        }else{
            hm.put(sum,1);
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        Main508 main508 = new Main508();
        System.out.println(main508.findFrequentTreeSum(root));
    }
}
