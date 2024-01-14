package HasCycle;

import util.ListNode;

import java.util.List;

public class Solution {

    /**
     * 141 环形链表
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head){
       if(head==null||head.next==null){
           return false;
       }

       ListNode slow = head;
       ListNode fast = head.next;
       while (slow!=fast){
           if(fast==null||fast.next==null){
               return false;
           }
           slow = slow.next;
           fast = fast.next.next;
       }
       return true;
    }
    public static void main(String[] args) {
        ListNode one = new ListNode(1,null);
        ListNode two = new ListNode(2,null);
        ListNode three = new ListNode(3,null);
        ListNode four = new ListNode(4,null);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = three;
        Solution s = new Solution();
        boolean b = s.hasCycle(one);
        System.out.println(b);
    }
}
