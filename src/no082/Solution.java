package no082;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {


    public static class ListNode {
        int val;
        Solution.ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode hh = new ListNode(0);
        hh.next = head;
        ListNode curr = head;
        ListNode pre = hh;
        boolean isRep = false;
        while(curr!=null){

            while(curr!=null && curr.next!=null && curr.val == curr.next.val){
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
        return head.next;
    }

}
