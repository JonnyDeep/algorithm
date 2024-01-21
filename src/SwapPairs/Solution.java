package SwapPairs;

import util.ListNode;

public class Solution {

    /**
     * 24 两两交换链表中的节点
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        Solution s = new Solution();
        ListNode listNode = s.swapPairs(head);
        ListNode.print(listNode);
    }
}
