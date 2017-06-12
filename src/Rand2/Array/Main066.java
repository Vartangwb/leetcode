package Array;

/**
 * Created by twb on 2017/6/7.
 */
public class Main066 {

    public static int[] plusOne(int[] digits) {

        int carry = 1;
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            int sum = carry+digits[i];
            carry = sum / 10;
            digits[i] = sum%10;
        }
        if(carry==1){
            int[] res = new int[len+1];
            res[0]=1;
            for (int i = 1; i < res.length; i++){
                res[i] = digits[i - 1];
            }
            return res;
        }
        return digits;

    }
    public static void main(String[] args) {

        System.out.println(plusOne(new int[]{0}));
    }
}
