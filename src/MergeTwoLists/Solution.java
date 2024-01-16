package MergeTwoLists;

import util.ListNode;

import javax.swing.plaf.InsetsUIResource;
import java.util.List;
import java.util.ListResourceBundle;

public class Solution {

    /**
     * 21 双指针
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
         if(list1==null) return list2;
         if(list2==null) return list1;
         if(list1==null && list2==null) return null;

         ListNode head = new ListNode(-1,null);
         ListNode tmp=head;
         while (list1!=null && list2!=null){
             if(list1.val<=list2.val){
                 tmp.next = list1;
                 list1 = list1.next;
             }else{
                 tmp.next = list2;
                 list2  = list2.next;
             }
             tmp = tmp.next;
         }
         tmp.next = list1==null?list2:list1;
         return head.next;
    }


    public static void main(String[] args) {
        ListNode one1 = new ListNode(1,null);
        ListNode two = new ListNode(2,null);
        ListNode three = new ListNode(3,null);
        ListNode four1 = new ListNode(4,null);
        ListNode four2 = new ListNode(4,null);
        ListNode one2 = new ListNode(1, null);
        one1.next=two;
        two.next = four1;
        one2.next = three;
        three.next = four2;

        Solution s = new Solution();
        ListNode listNode = s.mergeTwoLists(one1, one2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }


    }
}
