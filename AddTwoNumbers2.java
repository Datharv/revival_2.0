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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
    
        // ListNode prev;
        // while(l1 != null && l2 != null) {
        //     int sum = 0;
        //     sum += l1.val;
        //     sum += l2.val;
        //     sum+=carry;
        //     l1 = l1.next;
        //     l2 = l2.next;
        //     ListNode next = new ListNode(sum %10);
        //     head.next = next;
        //     head = head.next;
        //     carry = sum/10;
        // }
        // System.out.println("carry : " + carry);

        // while(l1 != null) {
        //     int sum = 0;
        //     sum = l1.val + carry;
        //     ListNode next = new ListNode(sum%10);
        //     head.next = next;
        //     head = next;
        //     carry = sum/10;
        //     l1 = l1.next;
        // }
        // while(l2 != null) {
        //     int sum = 0;
        //     sum = l2.val + carry;
        //     ListNode next = new ListNode(sum%10);
        //     head.next = next;
        //     head = next;
        //     carry = sum/10;
        //     l2 = l2.next;
        // }

        // if(carry > 0) {
        //     ListNode temp = new ListNode(carry);
        //     head.next = temp;
        // }

        while(l1 != null || l2!=null || carry != 0) {

            int first = l1 != null ? l1.val : 0;
            int second = l2 != null ? l2.val : 0;
            int sum = first + second + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(digit);
            head.next = temp;
            head = temp;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return dummy.next;
    }
}
