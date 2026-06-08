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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode temp=head;
        ListNode curr=head;
        ListNode next,prev=head;

        while(curr.next!=null && curr.next.next!=null)
        {
            next=curr.next;
            temp=curr;
            
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
           
            curr.next=temp;
            temp.next=next;
            prev.next=null;
            curr=next;
        }
        return;

    }
}
