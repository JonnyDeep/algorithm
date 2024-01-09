package ReverseList;

public class Solution {

    /**
     * 206 reverse List
     * use two points,fast ptr point the next
     *
     * |-------|
     * |       |-------->
     * |-------|
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur = head;
        ListNode tmp = head;
        while (cur!=null){
            cur = cur.next;
            tmp.next = prev;
            prev = tmp;
            tmp = cur;
        }
        return prev;
    }
    public void printList(ListNode head){
        ListNode tmp = head;
        while (tmp!=null){
            System.out.printf("%d ",tmp.val);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        ListNode five = new ListNode(5,null);
        ListNode four = new ListNode(4,five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode head = new ListNode(1,two);

        Solution s = new Solution();
        ListNode listNode = s.reverseList(head);

        s.printList(listNode);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
