package no251;

import java.util.Iterator;
import java.util.List;

/**
 * Created by twb on 2017/5/20.
 */
public class Solution {

    static class  Vector2D {
/*
        public Vector2D(List<List<Integer>> vec2d) {
            row = vec2d.iterator();
            if(row.hasNext())
                col = row.next().iterator();
        }

        public int next() {
            int lastValue = col.next();
            return lastValue;
        }

        public boolean hasNext() {
            if(col == null) {
                return false;
            }
            if(col.hasNext()) {
                return true;
            } else {
                while(row.hasNext()) {
                    col = row.next().iterator();
                    if(col.hasNext())
                        return true;
                }
                return false;
            }
        }

        private Iterator<List<Integer>> row = null;
        private Iterator<Integer> col = null;

        */

        public Vector2D(List<List<Integer>> vec2d) {
            row = vec2d.iterator();
            if(row.hasNext())
                col = row.next().iterator();
        }

        public int next() {

           return col.next();
        }

        public boolean hasNext() {
           if(col == null)
               return false;
           if(col.hasNext())
               return true;
           else{
               while(row.hasNext()==true){
                   col = row.next().iterator();
                   if(col.hasNext())
                       return true;
               }
           }
           return false;
        }

        private Iterator<List<Integer>> row = null;
        private Iterator<Integer> col = null;

    }

}
