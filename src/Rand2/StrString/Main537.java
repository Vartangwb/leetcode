package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main537 {

    public static String complexNumberMultiply(String a, String b) {
        String[] arr_1 = a.split("\\+");
        String[] arr_2 = b.split("\\+");
        int num[] = new int[4];
        num[0] = helper(arr_1[0],true);
        num[1] = helper(arr_1[1],false);
        num[2] = helper(arr_2[0],true);
        num[3] = helper(arr_2[1],false);
        int front = num[0]* num[2] + (-1)*num[1]* num[3];
        int end = num[1]*num[2] + num[3]* num[0];
        StringBuilder sb = new StringBuilder();
        sb.append(front).append("+").append(end).append("i");

        return sb.toString();
    }
    public static int helper(String ss, boolean flag){
        int num = 0;
        int len = ss.length()-1;
        if(flag== true) {
            if (ss.startsWith("-")) {
                num = -1 * Integer.valueOf(ss.substring(1));
            } else
                num = Integer.valueOf(ss.substring(0));
        }else{
            if (ss.startsWith("-")) {
                num = -1 * Integer.valueOf(ss.substring(1,len));
            } else
                num = Integer.valueOf(ss.substring(0,len));
        }
        return num;
    }

    public static void main(String[] args) {
            System.out.println(complexNumberMultiply("1+4i","1+2i"));
    }

}
