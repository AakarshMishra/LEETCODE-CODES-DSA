/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
            flag=true;
            break;
            }
        }
        if(flag==false)
        return null;
        ListNode start=head;
    while(start!=slow)
    {
      start=start.next;
      slow=slow.next;
    }
    return slow;
    }
}