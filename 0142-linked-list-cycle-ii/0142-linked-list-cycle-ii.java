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
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode Slow = head;
        ListNode Fast = head;
         while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;
            if(Slow == Fast){
                Slow = head;  // Reset slow
                while(Slow != Fast){
                    Fast = Fast.next;
                    Slow = Slow.next;
                }
                return Slow;
            }
        }
        return null;  
    }
}