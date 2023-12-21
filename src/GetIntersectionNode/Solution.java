package GetIntersectionNode;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        Set<ListNode> nodes = new HashSet<>();
        int countA = 0;
        int countB = 0;
        while (headA!=null && headB!=null){
            if(nodes.contains(headA)){
                return headA;
            }
            nodes.add(headA);
            headA=headA.next;
            countA++;
            if(nodes.contains(headB)){
                return headB;
            }
            nodes.add(headB);
            headB = headB.next;
            countB++;
        }
        while (headA!=null){
            if(nodes.contains(headA)){
                return headA;
            }
            nodes.add(headA);
            headA =headA.next;
            countA++;
        }

        while (headB!=null){
            if(nodes.contains(headB)){
                return headB;
            }
            nodes.add(headB);
            headB = headB.next;
            countB++;
        }
        return null;
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
