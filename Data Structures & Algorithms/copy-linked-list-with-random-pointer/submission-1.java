/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy=new Node(-1);
        Node temp=head;
        Node n=dummy;
        while(temp!=null)
        {
            n.next=new Node(temp.val);
            temp=temp.next;
            n=n.next;
        }
        HashMap<Node,Node> map=new HashMap<>();
        temp=head;
        n=dummy.next;
        while(temp!=null)
        {
            map.put(temp,n);
            temp=temp.next;
            n=n.next;
        }
        n=dummy.next;
        temp=head;
        while(n!=null)
        {
            
            n.random=map.get(temp.random);
            temp=temp.next;
            n=n.next;
        }
        return dummy.next;
    }
}
