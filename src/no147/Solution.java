package no147;

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

    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return null;
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode currNode = head;
        newHead.next = null;
        ListNode index = newHead;
        while(currNode!=null){
            ListNode tmp = currNode.next;
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
        solution.printLn(solution.insertionSortList(head));
    }

}
