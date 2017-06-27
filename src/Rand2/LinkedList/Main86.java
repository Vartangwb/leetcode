package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main86 {

    public static ListNode partition(ListNode head, int x) {
        ListNode min = new ListNode(0);
        ListNode max = new ListNode(0);
        ListNode curr = head;
        ListNode curr1 = min;
        ListNode curr2 = max;
        while(curr!=null){
            ListNode tmp = curr.next;
            if(curr.val<x){
                curr.next = curr1.next;
                curr1.next = curr;
                curr1 = curr1.next;
            }else if(curr.val>=x){
                curr.next = curr2.next;
                curr2.next = curr;
                curr2 = curr2.next;
            }
            curr = tmp;
        }
        curr1.next = max.next;
        return min.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        ListNode tt = partition(head, 2);
        while(tt!=null){
            System.out.println(tt.val);
            tt = tt.next;
        }
    }
}
