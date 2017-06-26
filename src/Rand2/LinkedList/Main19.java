package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
