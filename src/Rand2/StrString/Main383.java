package StrString;

import java.util.HashMap;

/**
 * Created by twb on 2017/7/1.
 */
public class Main383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }else{
                hm.put(magazine.charAt(i), 1);
            }
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(hm.containsKey(ransomNote.charAt(i))==false){
                return false;
            }else{
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
            }
        }
        for(Character c:hm.keySet()){
            if(hm.get(c)<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            System.out.println(canConstruct("asdde","asw"));
    }

}
