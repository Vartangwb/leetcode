package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main557 {

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            arr[i] = reverse(arr[i]);
            sb.append(arr[i]+" ");
        }
        return sb.toString().trim();

    }

    public static String reverse(String s) {
        char[] tmp = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char tmpp = tmp[left];
            tmp[left] = tmp[right];
            tmp[right] = tmpp;
            left++;
            right--;
        }
        return new String(tmp);
    }

    public static void main(String[] args) {
            System.out.println(reverseWords("asdsa asjdhk"));
    }

}
