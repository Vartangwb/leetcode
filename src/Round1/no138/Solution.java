package Round1.no138;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
    };

    public RandomListNode copyRandomList(RandomListNode head) {

        if(head==null)
            return head;
        RandomListNode node = head;

        while(node!=null){
            RandomListNode randomNode = new RandomListNode(node.label);
            randomNode.next = node.next;
            node.next = randomNode;
            node = randomNode.next;
        }

        node = head;
        while(node!=null){
            if(node.random!=null)
                node.next.random = node.random.next;
            node = node.next.next;
        }
        RandomListNode randomHead = head.next;
        node = head;
        RandomListNode curr = null;
        while(node!=null){
            curr = node.next;
            node.next = curr.next;
            if(curr.next!=null)
                curr.next = curr.next.next;
            node = node.next;
        }
        return randomHead;
    }

}
