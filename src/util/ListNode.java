package util;

import IsPalindrome.Solution;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) { this.val = val;}

    public static void print(ListNode node){
        while (node!=null){
            System.out.printf("%d ",node.val);
            node = node.next;
        }
        System.out.printf("\n");
    }
}
