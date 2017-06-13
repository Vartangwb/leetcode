package Round1.no134;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tmp = 0;
        int total = 0;
        int sum = 0;
        for(int i = 0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(sum<0){
                tmp=i+1;
                sum = 0;
            }
        }
        if(total<0){
            return -1;

        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.canCompleteCircuit(new int[]{1,2,3,},new int[]{2,3,4});
    }
}


