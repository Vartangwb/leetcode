package StrString;

/**
 * Created by twb on 2017/7/1.
 */
public class Main165 {

        public static int compareVersion(String version1, String version2) {

            String str1[] = version1.split("\\.");
            String str2[] = version2.split("\\.");
            int len = Math.max(str1.length, str2.length);
            for(int i = 0;i<len;i++){
                int v1 = i < str1.length ? Integer.parseInt(str1[i]) : 0;
                int v2 = i < str2.length ? Integer.parseInt(str2[i]) : 0;
                if(v1>v2)
                    return 1;
                else if(v1<v2)
                    return -1;

            }
            return 0;

        }

        public static void main(String[] args) {
        System.out.println(compareVersion("12310", "2222"));
    }

}
