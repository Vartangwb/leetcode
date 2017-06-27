package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main82 {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode hh = new ListNode(0);
        hh.next = head;
        ListNode pre = hh;
        ListNode curr = head;
        while(curr!=null){
            while(curr!=null && curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            if(curr == pre.next){
                pre = pre.next;
                curr = curr.next;
            }else{
                pre.next = curr.next;
                curr = curr.next;
            }
        }
        return hh.next;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        if(head==null)
            return null;
        ListNode curr = head;
        ListNode nxt = curr.next;
        while(nxt!=null){
            ListNode tmp = null;
            if(curr.val == nxt.val)
            {
                tmp = nxt.next;
                curr.next = nxt.next;
                nxt = tmp;
            }else{
                curr = nxt;
                nxt = curr.next;
            }
        }
        return head;
    }
        public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        ListNode tt = deleteDuplicates(head);
        while(tt!=null){
            System.out.println(tt.val);
            tt = tt.next;
        }
    }
}
