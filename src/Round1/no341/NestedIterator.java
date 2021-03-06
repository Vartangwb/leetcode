package Round1.no341;

/**
 * Created by twb on 2017/5/17.
 */

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
/*
public class NestedIterator implements Iterator<Integer> {

    Stack<NestedInteger> stc;
    public NestedIterator(List<NestedInteger> nestedList) {
        stc = new Stack<NestedInteger>();
        for(int i=nestedList.size()-1;i>=0;i--){
            stc.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stc.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stc.isEmpty()){
            NestedInteger curr = stc.peek();
            if(curr.isInteger()==true){
                return true;
            }
            stc.pop();
            for(int j = curr.getList().size()-1;j>=0;j--){
                stc.push(curr.getList().get(j));
            }
        }
        return false;
    }
}
*/
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */