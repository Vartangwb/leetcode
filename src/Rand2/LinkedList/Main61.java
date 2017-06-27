package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main61 {

    public static ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        ListNode tail = null;
        while(curr != null){
            len++;
            if(curr.next==null)
                tail = curr;
            curr = curr.next;

        }
        k = k%len;
        curr = head;
        while(k>1){
            curr = curr.next;
            k--;
        }
        ListNode head2 = curr.next;
        curr.next = null;
        tail.next = head;
        return head2;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode tt = rotateRight(head, 2000000000);
        while(tt!=null){
            System.out.println(tt.val);
            tt = tt.next;
        }
    }
}
