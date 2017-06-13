package Round1.no319;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {
    //public int findDuplicate(int[] nums) {

   // }
   public int bulbSwitch(int n) {
        int i =1;
        int res = 0;
        for(i = 1; i*i<=n;i++){
            res++;
        }
        return res;
   }


    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.bulbSwitch(4));
    }

}
