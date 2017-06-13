package Round1.no143;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {


    public static class ListNode {
        int val;
        Solution.ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        ListNode currNode = p1;
        ListNode toReverse = p1.next;
        currNode.next = null;
        ListNode tt = reverse(toReverse);
       // printLn(tt);
       // printLn(head);
        ListNode cuuu = tt;
        ListNode currr = head;
        while(cuuu!=null){
            ListNode tmp = cuuu.next;
            cuuu.next = currr.next;
            currr.next = cuuu;
            currr = currr.next.next;
            cuuu = tmp;
        }
        //printLn(head);
    }
    public void printLn(ListNode root){
        while(root!=null){
            System.out.println(root.val);
            root = root.next;
        }
    }

    public ListNode reverse(ListNode head){
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
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        solution.reorderList(head);
    }
}

