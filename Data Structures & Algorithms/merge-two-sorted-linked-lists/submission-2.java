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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        // keep dummy node so that later we can point dummy.next has head
        ListNode dummy = new ListNode(0);
        ListNode temp3 = dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp3.next = temp1;
                temp1=temp1.next;
            } else {
                temp3.next = temp2;
                temp2=temp2.next;
            }

            temp3=temp3.next;
        }

        if(temp1!=null) temp3.next=temp1;

        else if(temp2!=null) temp3.next = temp2;

        return dummy.next;      
    }
}