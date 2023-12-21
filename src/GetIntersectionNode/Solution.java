package GetIntersectionNode;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /**
     * 169
     * @param headA
     * @param headB
     * @return
     */

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(2);
        ListNode headB = new ListNode(1);
        headA.next = new ListNode(6);
        headB.next =new ListNode(5);
        headA.next.next = new ListNode(4);
        Solution s = new Solution();
        ListNode intersectionNode = s.getIntersectionNode(headA, headB);
        System.out.println(intersectionNode);
    }


    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
