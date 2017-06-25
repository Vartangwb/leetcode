package HM;

import java.util.*;

import static HM.Main205.isIsomorphic;

/**
 * Created by twb on 2017/6/19.
 */
public class Main249 {



        public static List<List<String>> groupStrings(String[] strings) {
            List<List<String>> ret = new ArrayList<List<String>>();
            if (strings == null || strings.length == 0) {
                return ret;
            }

            HashMap<String, List<String>> map = new HashMap<String, List<String>>();
            for (int i = 0; i < strings.length; i++) {
                String s = strings[i];
                int offset = s.charAt(0) - 'a';
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    char c = (char) (s.charAt(j) - offset);
                    if (c < 'a') {
                        c = (char) (c + 26);
                    }
                    sb.append(c);
                }
                String shiftedStr = sb.toString();
                if (!map.containsKey(shiftedStr)) {
                    map.put(shiftedStr, new ArrayList<String>());
                }
                map.get(shiftedStr).add(s);
            }

            for (String head : map.keySet()) {
                ret.add(map.get(head));
            }

            return ret;
        }

    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            // 出现的第偶数次，将其从Set中移出
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            } else {
                // 出现的第奇数次，将其加入Set中
                set.add(s.charAt(i));
            }
        }
        // 最多只能有一个奇数次字符
        return set.size() <= 1;
    }

    public static void main(String[] args) {

        System.out.println(groupStrings(new String[]{}));;

    }



}