package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main520 {

    public static boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)){
            return true;
        }
        if(word.toLowerCase().equals(word)){
            return true;
        }
        int len = word.length();
        int i = 0;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z')
            i++;
        else{
            return false;
        }
        for(;i<len;i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){

            }else{
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
            System.out.println(detectCapitalUse("hello ,asdas asd"));
    }

}
