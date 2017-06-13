package Round1.no482;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public String licenseKeyFormatting(String S, int K) {
        String tmp = S.replaceAll("-","").toUpperCase();
        System.out.println(tmp.length());
        int len = tmp.length();
        int firstLen = len % K;
        StringBuilder sb = new StringBuilder();
        if(firstLen!=0){
            sb.append(tmp.substring(0,firstLen));
        }
        //firstLen;
        System.out.println(firstLen);
        System.out.println(firstLen+K);
        while(firstLen+K<=len){
            sb.append("-").append(tmp.substring(firstLen,firstLen + K));
            firstLen = firstLen+K;
        }
        if(sb.charAt(0) == '-')
            return sb.toString().substring(1);
        return sb.toString();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.licenseKeyFormatting("---",3));
    }

}
