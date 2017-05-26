package no142;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                break;
        }

        ListNode curr = head;
        while(curr!=slow){
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next.next;
        System.out.println(solution.detectCycle(head).val);
    }

}
