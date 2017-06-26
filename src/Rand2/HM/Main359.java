package HM;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by twb on 2017/6/19.
 */
public class Main359 {

    public class Logger {
        private Map<String, Integer> time = new HashMap<>();

        /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
         If this method returns false, the message will not be printed.
         The timestamp is in seconds granularity. */
        public boolean shouldPrintMessage(int timestamp, String message) {
            if(timestamp < time.getOrDefault(message,0) )
                return false;
            time.put(message,timestamp + 10);
            return true;
        }
    }

        public static void main(String[] args) {
        System.out.println();
    }



}