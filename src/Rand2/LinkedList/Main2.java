package LinkedList;

/**
 * Created by twb on 2017/6/26.
 */
public class Main2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode curr = head.next;
        int carry = 0;
        while(l1!=null || l2!=null){
            int num1 =  l1!=null?l1.val:0;
            int num2 = l2!=null?l2.val:0;
            int currval = (num1+num2+carry)%10;
            carry = (num1+num2+carry)/10;
            curr =  new ListNode(currval);
            curr = curr.next;
        }
        if(carry==1){
            curr = new ListNode(1);
        }else{}

        return head.next;
    }

}
