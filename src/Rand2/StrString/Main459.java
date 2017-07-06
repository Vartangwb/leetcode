package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main459 {

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for(int i = len/2;i>=2;i++){
            int repeatNum = len/i;
                    if(len%i==0){
                        StringBuilder sb = new StringBuilder();
                        for(int ii =0 ;ii<repeatNum;ii++){
                            sb.append(s.substring(0, i));
                        }
                        if(sb.toString().equals(s))
                            return true;
                    }
        }
        return false;
    }
    public static void main(String[] args) {
            System.out.println(repeatedSubstringPattern("hello ,asdas asd"));
    }

}
