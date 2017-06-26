package HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by twb on 2017/6/19.
 */
public class Main500 {

    public static String[] findWords(String[] words) {
        String[] s = new String[]{"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length; i++){
            for(int k = 0; k<s[i].length();k++){
                hm.put(s[i].charAt(k), i);
            }
        }
        List<String> ls = new ArrayList<>();
        for(int i = 0;i < words.length ;i++){
            int index =  hm.get(words[i].toUpperCase().charAt(0));
            for(int k = 0;k<words[i].length();k++){
                if(hm.get(words[i].toUpperCase().charAt(k))!=index){
                    index = -1;
                    break;
                }
            }
            if(index!=-1)
                ls.add(words[i]);
        }
        return ls.toArray(new String[ls.size()]);
    }

    public static void main(String[] args) {

        System.out.println(findWords(new String[]{"asdcd", "asd", "qwe"}));
    }



}