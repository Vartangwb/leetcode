package no264;

/**
 * Created by twb on 2017/5/20.
 */
public class Solution {

    public boolean verifyPreOrder(int preOrder[]){
        return verifyPreOrder(preOrder, 0, preOrder.length - 1);
    }

    public boolean verifyPreOrder(int preOrder[], int left, int right){
        if(left == right)
            return true;
        int root = preOrder[left];

        int ii = left;
        while(ii < right && preOrder[ii+1] < root){
            ii++;
        }
        if(ii == right){
            return verifyPreOrder(preOrder, left+1, ii);
        }else{

            int currRig = ii + 1;
            while(currRig<=right && preOrder[currRig] >root){
                currRig++;
            }
            if(currRig!=right+1){
                return false;

            }
            return verifyPreOrder(preOrder, left+1, ii) && verifyPreOrder(preOrder, ii+1, right);

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.verifyPreOrder(new int[]{2,1,3}));
    }
}
