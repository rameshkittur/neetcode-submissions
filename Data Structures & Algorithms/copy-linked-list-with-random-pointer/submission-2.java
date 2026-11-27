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
        Node temp = head;

        // 1. place the copy nodes in between the existing nodes
        while(temp!=null){
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp=temp.next.next;
        }

        // 2. point the random pointers for copied nodes
        temp=head;
        while(temp!=null){
            if(temp.random!=null)
                temp.next.random=temp.random.next;
            else
                temp.next.random=null;     
            temp=temp.next.next;
        }

        // 3. saperate out copied nodes and orginal nodes
        temp=head;
        Node dummy = new Node(0);
        Node ptr = dummy;
        while(temp!=null){
            ptr.next = temp.next;
            temp.next=temp.next.next;
            if(temp.next!=null)
                ptr.next.next = temp.next.next;
            else 
                ptr.next.next = null;   

            temp=temp.next;
            ptr=ptr.next;
        }

        return dummy.next;

        
    }
}
