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
    int count = 0;
    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(count <= 1){
            return head;
        }

        count = count / 2 ;
        ListNode temp1 = head;
        for(int i = 1; i < count; i++){
           temp1 = temp1.next;
        }
        
        return temp1.next;
    }
}