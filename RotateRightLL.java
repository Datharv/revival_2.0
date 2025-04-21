public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int count = countNodes(head);
        k = k % count;
        if(k == 0) return head;

        ListNode curr = head;
        int index = count - k;

        while(index-- > 1) {
            curr = curr.next;
        }
        ListNode next = curr.next;

        curr.next = null;
        ListNode ans = next;
        while(next.next != null) {
            next = next.next;
        }
        next.next = head;
        return ans;
    }

    public int countNodes(ListNode head) {
        int count = 0;
        while(head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
