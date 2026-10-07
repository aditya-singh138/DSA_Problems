/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode point(ListNode head,ListNode slow,ListNode fast){
        ListNode temp= head;
        while(temp!=slow){
            slow= slow.next;
            temp= temp.next;
        }
        return temp;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return point(head,slow,fast);
            }
        }
        return null;
    }
}