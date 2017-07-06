package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main434 {

    public static int countSegments(String s) {
        s = s.trim();
        if(s.equals(""))
            return 0;
        return s.split("\\s+").length;
    }
    public static void main(String[] args) {
            System.out.println(countSegments("hello ,asdas asd"));
    }

}
