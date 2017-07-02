package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main043 {

    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 == 0)
            return num2;
        if (len2 == 0)
            return num1;
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int buf[] = new int[len1+len2];

        for(int i = len1-1;i>=0;i--){
            for(int j = len2-1;j>=0;j--){
                int index = len1+len2-2-i-j;
                int val = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int vall = buf[index];

                buf[index] = (val+vall)%10;
                buf[index + 1] += (val+vall)/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k = len1+len2-1;k>=0;k--){
            if(sb.length() == 0 && buf[k] == 0)
                continue;
            sb.append(buf[k]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("123","100"));
    }

}
