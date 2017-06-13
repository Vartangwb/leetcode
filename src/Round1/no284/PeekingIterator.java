package Round1.no284;

import java.util.Iterator;

/**
 * Created by twb on 2017/5/24.
 */
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iter;
    Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        if(iter.hasNext()){
            next = iter.next();
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer tmp = next;
        next = iter.hasNext()?iter.next():null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return next!=null;
    }
}