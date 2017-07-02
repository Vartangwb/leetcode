package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main006 {

    public static String convert(String s, int nRows) {

        StringBuffer[] sbs = new StringBuffer[nRows];
        for(int iii = 0;iii<nRows;iii++){
            sbs[iii] = new StringBuffer();
        }
        int len = s.length();
        int i = 0;
        while(i < len){
            for(int index = 0;index<nRows && i<len;index++){
                sbs[index].append(s.charAt(i));
                i++;
            }
            for(int index = nRows-2;index>=1 && i<len;index--){
                sbs[index].append(s.charAt(i));
                i++;
            }
        }
        for(int ii = 1;ii<nRows;ii++){
            sbs[0].append(sbs[ii]);
        }
        return sbs[0].toString();
    }
    public static void main(String[] args) {
        System.out.println(convert("abcddcba",3));
    }

}
