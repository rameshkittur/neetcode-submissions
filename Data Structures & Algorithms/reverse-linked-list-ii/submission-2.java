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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 1,2,3,4,5 : left = 1, right = 3
        ListNode dummy = new ListNode(0,head);

        ListNode prevLeft = dummy;
        ListNode leftNode = head;
        
        // 1. move the ponter to start of reverse point and keep track 
        // of its prev (left,prevLeft)
        // for the example prevLeft is at dummy and left is at 1
        for(int i=0;i<left-1;i++){
            leftNode=leftNode.next;
            prevLeft = prevLeft.next;
        }

        // 2. Reverse the list from left to right
        // 3,2,1 
        ListNode prev = null;
        ListNode curr = leftNode;
        for(int i=0;i<right-left+1;i++){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        // 3. after reversing now join the list to make final solution
        // 3,2,1,4,5
        prevLeft.next.next=curr;
        prevLeft.next=prev;

        return dummy.next;

    }
}