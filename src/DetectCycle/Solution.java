package DetectCycle;

import util.ListNode;

public class Solution {


    /**
     * 142 环形链表 II
     *
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }

        ListNode slow = head,fast = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                fast = head;
                while (slow!=fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1,null);
        ListNode two = new ListNode(2,null);
        ListNode three = new ListNode(3,null);
        ListNode four = new ListNode(4,null);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        Solution s = new Solution();
        ListNode listNode = s.detectCycle(one);
        System.out.println(listNode.val);
    }
}
