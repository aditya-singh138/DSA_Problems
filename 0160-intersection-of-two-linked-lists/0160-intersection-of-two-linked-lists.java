/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        ListNode temp1= headA;
        ListNode temp2= headB;
        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        if(l2>l1){
            for(int i=1;i<=l2-l1;i++){
                headB= headB.next;
            }
        }
        else{
            for(int i=1;i<=l1-l2;i++){
                headA= headA.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA= headA.next;
            headB= headB.next;
        }
        return null;
    }
}