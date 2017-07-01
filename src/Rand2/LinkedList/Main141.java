package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main141 {

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null)
            return false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    public static void printLn(ListNode root){
        while(root!=null){
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode helper = new ListNode(0);
        ListNode currNode = head;
        while(currNode!=null){
            ListNode tmp = currNode.next;
            currNode.next = helper.next;
            helper.next = currNode;
            currNode = tmp;
        }
        return helper.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;//new ListNode(4);
        System.out.println(hasCycle(head));

    }
}
