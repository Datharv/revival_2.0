
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        int count1 = 0;
        int count2 = 0;

        while(a!= null) {
            count1++;
            a = a.next;
        }

        while(b!=null) {
            count2++;
            b = b.next;
        }

        ListNode big = null;
        ListNode small = null;
        int diff = 0;
        if(count1 > count2) {
            big = headA;
            small = headB;
            diff = count1 - count2;
        }else{
            big = headB;
            small = headA;
            diff = count2 - count1;
        }
        
        System.out.println(diff);


        while(diff > 0 && big != null) {
            big = big.next;
            diff--;
        }

        while(small != null && big != null) {
            if(small == big){
                return small;
            }
            small = small.next;
            big = big.next;
        }

        return null;
        
    }
}
