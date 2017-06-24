package HM;

/**
 * Created by twb on 2017/6/19.
 */
public class Main138 {


    public static RandomListNode solve(RandomListNode head){

        if(head == null){
            return null;
        }
        RandomListNode curr = head;
        while(curr!=null){
            RandomListNode tmp = new RandomListNode(curr.label);
            tmp.next = curr.next;
            curr.next = tmp;
            curr = curr.next.next;

        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        RandomListNode h = curr.next;
        RandomListNode currr = null;
        while(curr!=null){
            currr = curr.next;
            curr.next = currr.next;
            if(currr.next!=null){
                currr.next = currr.next.next;
            }
            curr = curr.next;
        }
        return h;
    }


    public static void main(String[] args) {

    }



}


class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };