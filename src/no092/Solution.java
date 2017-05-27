package no092;

/**
 * Created by twb on 2017/5/27.
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode hh = new ListNode(0);
        hh.next = head;
        ListNode nn = hh;
        int tmo =m;
        while(m>1){
            hh = hh.next;
            m--;
        }

        int len = n-tmo;
        ListNode curr = hh.next;
        ListNode cc = null;

        while(len>=0 && curr!=null){
            if(curr == hh.next)
            {

                len--;
                cc = curr;
                curr = curr.next;

                continue;

            }

            ListNode tmp = curr.next;
            cc.next = curr.next;
            curr.next = hh.next;
            hh.next = curr;
            curr = tmp;
                        len--;
        }
        return nn.next;
    }

    public void printLn(ListNode root){
        while(root!=null){
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        solution.printLn(solution.reverseBetween(head,2,3));
    }
}
