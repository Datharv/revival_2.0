class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = curr;

        while(curr != null && prev.next != null){
            ListNode next = curr.next;
            prev.next = next;
            curr.next = next != null ? next.next : null;
            prev = prev.next != null ? prev.next : prev;
            curr = curr!=null ? curr.next : null;
        }
        prev.next = temp;
        return head;
        // return prev;
    }
}
