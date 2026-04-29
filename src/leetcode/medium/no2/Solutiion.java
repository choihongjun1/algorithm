package leetcode.medium.no2;

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
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add = new ListNode();
        add.val = (l1.val + l2.val) % 10;
        int carry = ((l1.val + l2.val) / 10) % 10;

        ListNode head1 = l1.next;
        ListNode head2 = l2.next;
        ListNode prev = add;

        while(head1 != null && head2 != null) {
            ListNode node = new ListNode();
            int s = head1.val + head2.val + carry;
            node.val = s % 10;
            prev.next = node;
            carry = s / 10;

            prev = prev.next;
            head1 = head1.next;
            head2 = head2.next;
        }

        while(head1 != null) {
            ListNode node = new ListNode();
            int s = head1.val + carry;
            node.val = s % 10;
            prev.next = node;
            carry = s / 10;

            prev = prev.next;
            head1 = head1.next;
        }

        while(head2 != null) {
            ListNode node = new ListNode();
            int s = head2.val + carry;
            node.val = s % 10;
            prev.next = node;
            carry = s / 10;

            prev = prev.next;
            head2 = head2.next;
        }

        if(carry > 0) {
            prev.next = new ListNode(carry);
        }

        return add;
    }
}
