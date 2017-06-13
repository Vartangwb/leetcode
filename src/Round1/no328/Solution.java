package Round1.no328;


/**
 * Created by twb on 2017/5/14.
 */
public class Solution {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
  }

    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode curr = head;
        ListNode secCurr = head.next;
        ListNode secNode = secCurr;
        while(secCurr!=null && secCurr.next!=null){
            curr.next = curr.next.next;
            secCurr.next = secCurr.next.next;
            curr = curr.next;
            secCurr = secCurr.next;
        }
        curr.next = secNode;
        return head;
    }
    public void printLn(ListNode ls){
        while(ls!=null){
            System.out.println(ls.val);
            ls = ls.next;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode ls = new ListNode(1);
        ls.next = new ListNode(2);
        ls.next.next = new ListNode(3);
        solution.printLn(solution.oddEvenList(ls));
    }

}
