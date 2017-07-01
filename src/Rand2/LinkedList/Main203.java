package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main203 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = null;
        ListNode curr_ = node;
        while(head!=null){
            ListNode curr = head.next;
            if(head.val != val){
                head.next = curr_.next;
                curr_.next = head;
                curr_ = curr_.next;
            }
            head = curr;
        }
        return node.next;
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
        head.next.next.next = new ListNode(3);
        printLn(removeElements(head,3));

    }
}
