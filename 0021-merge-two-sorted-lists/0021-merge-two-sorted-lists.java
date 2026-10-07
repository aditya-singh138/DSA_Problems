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
        ListNode temp1= list1;
        ListNode temp2= list2;
        ListNode res= new ListNode(0);
        ListNode r= res;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                r.next= temp1;
                r=r.next;
                temp1=temp1.next;
            }
            else{
                r.next= temp2;
                r=r.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            r.next= temp1;
            r=r.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            r.next= temp2;
            r=r.next;
            temp2=temp2.next;
        }
        return res.next;
    }
}