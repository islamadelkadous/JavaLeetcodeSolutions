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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode counter = head;
        int len = 1;
        while (counter.next != null) {
            counter = counter.next;
            len++;
        }
        counter.next = head;
        int rotation = len - k % len;
        for (int i = 0; i < rotation; i++) {
            counter = counter.next;
        }
        ListNode newHead = counter.next;
        counter.next = null;

        return newHead;
    }
}
