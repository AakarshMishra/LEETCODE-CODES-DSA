/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode list3=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.val==list2.val)
            {
                ListNode newn=new ListNode(list1.val);
                list3.next=newn;
                list3=list3.next;
                list1=list1.next;
            }
            else if(list1.val<list2.val)
            {
                ListNode newn=new ListNode(list1.val);
                list3.next=newn;
                list3=list3.next;
                list1=list1.next;
            }
            else
            {
                ListNode newn=new ListNode(list2.val);
                list3.next=newn;
                list3=list3.next;
                list2=list2.next;
            }
        }
        if(list1!=null)
        {
            list3.next=list1;
        }
        if(list2!=null)
        {
            list3.next=list2;
        }
        return dummy.next;
    }
}