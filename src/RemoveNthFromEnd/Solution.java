package RemoveNthFromEnd;

import util.ListNode;

public class Solution {

    /**
     * 19 删除链表的倒数第N个节点，快慢指针
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head,int n){

        ListNode fast  = head;
        ListNode slow = head;
        ListNode pre = new ListNode();
        for (int i=0;i<n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            pre = slow;
            slow = slow.next;
        }
        if(slow==head){
            head = slow.next;
            return  head;
        }
        pre.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        Solution s = new Solution();
        ListNode listNode = s.removeNthFromEnd(head, 5);
        ListNode.print(listNode);
    }
}
