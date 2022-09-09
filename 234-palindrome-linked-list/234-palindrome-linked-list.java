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
    public boolean isPalindrome(ListNode head) {
        StringBuilder values = new StringBuilder();
        int count = 0;
        while (head.next != null) {
            values.append(head.val);
            head = head.next;
        }
        values.append(head.val);
        if (values.toString().equals(values.reverse().toString())) return true;
        System.out.print(values.toString());
        return false;
    }
}