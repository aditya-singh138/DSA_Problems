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
        ListNode res= new ListNode(0);
        res.next= head;
        ListNode r= res;
        for(int i=1;i<left;i++){
            r=r.next;
        }
        ListNode curr= r.next;
        ListNode prev= null;
        ListNode nextt;
        for(int i=1;i<=right-left+1;i++){
            if(curr==null) break;
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        r.next.next= curr;
        r.next= prev;
        return res.next;
    }
}