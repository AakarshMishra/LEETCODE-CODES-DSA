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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        {
            return head;
        }
        ListNode curr=head;
        int size=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            size++;
        }
        ListNode tail=curr;
        if(k%size==0)
        return head;
        int c=0;
        c=size-k%size;
        curr=head;
        while(c!=1)
        {
            curr=curr.next;
            c--;
        }
        tail.next=head;
        head=curr.next;
        curr.next=null;
        return head;


    }
}