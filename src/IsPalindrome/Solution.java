package IsPalindrome;

import java.util.Stack;

public class Solution {

    public boolean isPalindrome(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        if (head==null){
            return false;
        }
        
        ListNode tmp = head;
        while (tmp!=null){
            stack.push(tmp);
            tmp = tmp.next;
        }
        
        while (!stack.isEmpty()){
            ListNode pop = stack.pop();
            if(pop.val!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode five = new ListNode(1,null);
        ListNode four = new ListNode(2,five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode head = new ListNode(1,two);

        Solution s = new Solution();
        boolean flag = s.isPalindrome(head);
        System.out.println(flag);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
