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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        {
            return head;
        }

        ListNode prev=head,curr,end;
        end=head;
        int i=0;
        while(i<n)
        {
            end=end.next;
            i++;
        }
        if(end==null)
        {
            return head.next;
        }
        curr=head;
        while(end!=null)
        {
            prev=curr;
            curr=curr.next;
            end=end.next;
        }
        prev.next=curr.next;
        return head;

    }
}
