package Round1.no043;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int but[] = new int[len1+len2];
        for(int i = len1-1;i>=0;i--){
            for(int j = len2-1;j>=0;j--){
                int index = len1+len2-i-j-2;
              //  int num = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                but[index] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                but[index+1] +=but[index]/10;
                but[index] = but[index]%10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k = len1+len2-1;k>=0;k--){
            if(sb.length() == 0 && but[k] == 0)
                continue;
            sb.append(but[k]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("100","10"));
    }
}
