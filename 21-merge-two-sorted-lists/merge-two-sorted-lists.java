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
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode ans=new ListNode(0);
        ListNode cur=ans;

        // int count=0;
        // while(temp1!=null){
        //     count++;
        //     temp1=temp1.next;
        // }
        // while(temp2!=null){
        //     count++;
        //     temp2=temp2.next;
        // }
        if(temp1==null){
            return temp2;
        }
        if(temp2==null){
            return temp1;
        }
        while(temp1!=null&&temp2!=null){
          if(temp1.val<=temp2.val){
            cur.next=temp1;
            temp1=temp1.next;
          }else{
            cur.next=temp2;
            temp2=temp2.next;
          }
          cur=cur.next;
        }
        if(temp1!=null){
            cur.next=temp1;
        }else{
            cur.next=temp2;
        }
        return ans.next;


    }
}