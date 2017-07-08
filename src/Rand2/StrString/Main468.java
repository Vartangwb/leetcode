package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main468 {

    public static String validIPAddress(String IP) {
        if(IP == null || IP.isEmpty()) return "Neither";
        if(IP.contains(":")){
            return (isV6(IP)?"IPv6":"Neither");
        } else {
            return (isV4(IP)?"IPv4":"Neither");
        }
    }

    public static boolean isV6(String ip){

        int dotCount = 0;
        for(int i = 0;i<ip.length();i++){
            if(ip.charAt(i)==':')
                dotCount++;
        }
        if(dotCount!=7)
            return false;
        String strs[] = ip.split(":");
        if(strs.length!=8)
            return false;
        for(String sss:strs){
            if(sss.length()!=4)
                return false;
            for(int i = 0;i<sss.length();i++){
                if(!((sss.charAt(i)>='0' && sss.charAt(i)<='9') || (sss.charAt(i)>='a' && sss.charAt(i)<='f') || ((sss.charAt(i)>='A' && sss.charAt(i)<='F'))))
                    return false;
            }
        }
        return true;
    }
    public static boolean isV4(String ip){
        int dotCount = 0;
        for(int i = 0;i<ip.length();i++){
            if(ip.charAt(i)=='.')
                dotCount++;
        }
        if(dotCount!=3)
            return false;
        String strs[] = ip.split("\\.");
        if(strs.length!=4)
            return false;
        for(String sss:strs){
            if(sss.length()>3 || sss.length()<=0)
                return false;
            if(sss.charAt(0)=='0' && sss.length()>1)
                return false;
            int num = 0;
            for(int ii=0;ii<sss.length();ii++){
                if(sss.charAt(ii)<'0' ||sss.charAt(ii)>'9'){
                    return false;
                }
                num=num*10+sss.charAt(ii)-'0';
            }
            if(num>255 || num<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
            System.out.println(validIPAddress("hello ,asdas asd"));
    }

}
