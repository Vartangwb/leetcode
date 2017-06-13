package Round1.no567;

/**
 * Created by twb on 2017/5/23.
 */
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
            return false;
        int count[] = new int[26];
        int count2[] = new int[26];
        for(int i = 0;i<s1.length();i++){
            count[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        if(equals(count, count2))
            return true;
        for(int i = s1.length();i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i - s1.length())-'a']--;
            if(equals(count, count2))
                return true;
        }
        return false;

    }
    public boolean equals(int count[],int count2[]){
        for(int i = 0;i<count.length;i++){
            if(count[i]!=count2[i])
                return false;
        }
        return true;
    }
}
