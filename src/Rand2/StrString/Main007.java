package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main007 {

    public static Integer atoi(String s) {
        long num = 0;
        if(s == null || s.length() <= 0)
            return 0;
        int flag = 1;
        int i = 0;
        if(s.charAt(0)<'0' || s.charAt(0)>'9'){
            if(s.charAt(0) == '-'){
                flag = 0;
                i++;
            }else if(s.charAt(0) == '+'){
                flag = 1;
                i++;
            }
        }

        for(;i<s.length();i++){
            if(s.charAt(i)>'9' || s.charAt(i)<'0')
                return (int)num;
            num = num*10+s.charAt(i)-'0';
            if(flag == 1){
                if(num>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }else if(flag == 0){
                if(num*-1<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }

        }
        return (int)num*(flag==1?1:-1);

    }
    public static void main(String[] args) {
        System.out.println(atoi("abcddcba"));
    }

}
