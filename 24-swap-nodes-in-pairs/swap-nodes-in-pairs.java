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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(temp==null||temp.next==null){
            return head;
        }
        while(temp!=null&&temp.next!=null){
            int temp1=temp.val;
            temp.val=temp.next.val;
            temp.next.val=temp1;
            temp=temp.next.next;

        }
        return head;
    }
}