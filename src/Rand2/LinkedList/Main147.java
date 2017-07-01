package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main147 {

    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return null;
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode currNode = head;
        newHead.next = null;
        ListNode index = newHead;
        while(currNode!=null){

            ListNode tmp = null;
            tmp = currNode.next;
            int val = currNode.val;
            while(index!=null && index.next!=null){
                if(val>index.next.val)
                    index = index.next;
                else{
                    break;
                }
            }
            currNode.next = index.next;
            index.next = currNode;
            currNode = tmp;
            index = newHead;

        }
        return newHead.next;
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
        head.next.next.next = new ListNode(4);


    }
}
