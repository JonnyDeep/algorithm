package AddTwoNumbers;

import util.ListNode;

import javax.swing.plaf.SliderUI;

public class Solution {

    /**
     * 2
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int tmp=0;
        ListNode cur = new ListNode(0,null);
        ListNode head = cur;
        while (l1!=null || l2!=null){
            tmp=(l1==null?0:l1.val)+(l2==null?0:l2.val)+tmp;
            ListNode newNode = new ListNode(tmp%10,null);
            tmp = tmp/10;
            cur.next = newNode;
            cur = cur.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(tmp>0){
            cur.next = new ListNode(1,null);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode two = new ListNode(2,new ListNode(4,new ListNode(3,null)));
        ListNode five = new ListNode(5,new ListNode(6,new ListNode(8,new ListNode(9,null))));
        Solution s = new Solution();
        ListNode listNode = s.addTwoNumbers(two, five);
        ListNode.print(listNode);
    }
}
