class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;
        ListNode start = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode end = reverseList(slow);
    
        while(start != null && end != null) {
            if(start.val != end.val) return false;
            start = start.next;
            end = end.next;
        }

        // Stack<Integer> st = new Stack<>();
        // while(start != null) {
        //     st.push(start.val);
        //     start = start.next;
        // }
        // while(head != null && !st.isEmpty()) {
        //     if(head.val != st.pop()) return false;
        //     head = head.next;
        // }

        return true;
    }

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
        
}
