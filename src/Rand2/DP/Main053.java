package DP;

/**
 * Created by twb on 2017/7/27.
 */
public class Main053 {

    public static int solve(int arr[]){
        int sum = arr[0];
        int max = sum;
        for(int i = 1;i<arr.length;i++){
            if(sum<0){
                sum = arr[i];
                max = Math.max(sum, max);
            }else{
                sum+=arr[i];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
