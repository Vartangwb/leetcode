package Round1.no024;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {
    public static class ListNode {
        int val;
        Solution.ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode curr = h;
        while(curr!=null && curr.next!=null && curr.next.next!=null){
            ListNode nxt = curr.next.next.next;
            ListNode ss = curr.next;
            ListNode sss = curr.next.next;
            ss.next = sss.next;
            sss.next = ss;
            curr.next = sss;
            curr = ss;
        }
        return h.next;

    }

}
