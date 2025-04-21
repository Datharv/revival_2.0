class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode curr  = head;
        ListNode prev = dummy;
        while(curr != null) {
            int data = prev.next.val;
            if(curr.next != null && data == curr.next.val){
                while(curr.next != null && data == curr.next.val) {
                    curr = curr.next;
                }
                curr = curr.next;
            }else{
                prev = curr;
            }
           
        }

        return dummy.next;
    }
}
