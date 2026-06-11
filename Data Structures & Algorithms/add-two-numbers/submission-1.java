/*
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1);
        ListNode temp1=l1,temp2=l2, temp3=l3;
        int carry=0;
        while(temp1!=null && temp2!=null)
        {
            temp3.next=new ListNode((temp1.val+temp2.val+carry)%10);
            carry= (temp1.val+temp2.val+carry)/10;
            temp1=temp1.next;
            temp2=temp2.next;
            temp3=temp3.next;
        }
        while(temp1!=null)
        {
            temp3.next=new ListNode((temp1.val+carry)%10);
            carry=(temp1.val+carry)/10;
            temp3=temp3.next;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            temp3.next=new ListNode((temp2.val+carry)%10);
            carry=(temp2.val+carry)/10;
            temp3=temp3.next;
            temp2=temp2.next;
        }
        if(carry!=0)
        {
            temp3.next=new ListNode(carry);
        }
        return l3.next;
        
    }
}
