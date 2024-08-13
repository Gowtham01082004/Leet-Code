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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode temp1=dummy;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        while(temp!=null){
            temp=temp.next;
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return dummy.next;
    }
}