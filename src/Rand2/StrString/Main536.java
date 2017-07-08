package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main536 {

    public static TreeNode str2tree(String s) {
        if(s.isEmpty())
            return null;
        int fount = s.indexOf('(');
        int val = fount==-1?Integer.parseInt(s):Integer.parseInt(s.substring(0, fount));
        TreeNode curr = new TreeNode(val);
        if(fount==-1)
            return curr;
        int start = fount;
        int cut = 0;
        for(int i = start;i<s.length();i++){
            if(s.charAt(i)=='(')
                cut++;
            else if(s.charAt(i)==')')
                cut--;
            if(cut==0 && start==fount){
                curr.left = str2tree(s.substring(start+1, i));
                start=i+1;
            }else if(cut==0){
                curr.right = str2tree(s.substring(start+1, i));
            }
        }

        return curr;
    }
    public static void main(String[] args) {

        System.out.println(str2tree("3(4)(2)").val);
        System.out.println(str2tree("3(4)(2)").left.val);

        System.out.println(str2tree("3(4)(2)").right.val);
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }