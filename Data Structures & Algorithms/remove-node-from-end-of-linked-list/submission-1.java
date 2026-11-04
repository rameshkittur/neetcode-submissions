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

        ListNode headOfReversedLL =  reverseLL(head);
        System.out.println("head of reverersed list : "+headOfReversedLL.val);
        ListNode prev = null;
        ListNode curr = headOfReversedLL;

        if(n==1){
            headOfReversedLL = curr.next;
            curr.next=null;
            return reverseLL(headOfReversedLL);
        }    

        for(int i=1;i<n;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        return reverseLL(headOfReversedLL);
    }

    private ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
