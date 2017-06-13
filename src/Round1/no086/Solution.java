package Round1.no086;

/**
 * Created by twb on 2017/5/26.
 */
public class Solution {

    public static class ListNode {
        int val;
        Solution.ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
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
            }else if(curr.val>x){
                curr.next = curr2.next;
                curr2.next = curr;
                curr2 = curr2.next;
            }
            curr = tmp;
        }
        curr1.next = max.next;
        return min.next;
    }

}
