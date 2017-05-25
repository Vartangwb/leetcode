package no229;

/**
 * Created by twb on 2017/5/25.
 */
public class Solution {

    public String getHint(String secret, String guess) {

        int[] sec_arr = new int[10];
        int[] gue_arr = new int[10];
        int res_A = 0;
        for(int i = 0; i < guess.length(); i++){
            if(guess.charAt(i) == secret.charAt(i)){
                res_A++;
            }
            sec_arr[guess.charAt(i) - '0']++;
            gue_arr[secret.charAt(i) - '0']++;
        }
        int res_B = 0;
        for(int i = 0;i<10;i++){
            res_B += Math.min(sec_arr[i], gue_arr[i]);
        }

        return res_A + "A" + (res_B - res_A) + "B";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getHint("1010", "1011"));
    }

}
