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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int carry=0;
        ListNode head = new ListNode();
        ListNode curr3 = head;

        while(curr1!=null || curr2!=null || carry!=0){
            int value1 = (curr1!=null) ? curr1.val : 0;
            int value2 = (curr2!=null) ? curr2.val : 0;

            int sum = value1 + value2 + carry;
            carry = sum/10;
            curr3.next = new ListNode(sum%10);
            curr3 = curr3.next;
            curr1=(curr1!=null)?curr1.next:null;
            curr2=(curr2!=null)?curr2.next:null;
        }
        return head.next;
    }
}
