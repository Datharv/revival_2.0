class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        int index = count-n;
        if(index == 0) return head.next;

        count = 1;
        ListNode node = head;
        while(node != null) {
            if(index == count) {
                node.next = node.next.next;
            }
            node = node.next;
            count++;
        } 
        return head;
    }
}
