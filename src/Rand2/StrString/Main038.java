package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main038 {

    public static String countAndSay(int n) {
        String tmp = String.valueOf(1);

        int k = 1;
        while(k < n){
            StringBuilder sb = new StringBuilder();
            int currCount = 1;
            int currVal = tmp.charAt(0);
            for(int i = 1;i<tmp.length();i++){
                if(tmp.charAt(i)!=currVal){
                    sb.append(currCount+""+(currVal-'0'));
                    currCount = 1;
                    currVal = tmp.charAt(i);
                }else{
                    currCount++;
                }
            }
            sb.append(currCount+""+(currVal-'0'));
            tmp = sb.toString();
            k++;
        }
        return tmp;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(2));
    }

}
