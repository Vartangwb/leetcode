package LinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by twb on 2017/6/26.
 */
public class Main24 {

    public static ListNode mergeKLists(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr!=null && curr.next!=null && curr.next.next!=null){
            ListNode tmp = curr.next.next.next;
            ListNode ss = curr.next;
            ListNode sss = curr.next.next;
            sss.next = ss;
            ss.next = tmp;
            curr.next = sss;
            curr = curr.next.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode tt = mergeKLists(head);
        while(tt!=null){
            System.out.println(tt.val);
            tt = tt.next;
        }
    }
}
