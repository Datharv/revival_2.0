
public class Solution
{
    public static Node sortList(Node head) {
        // Write your code here
        Node temp = head;
        Node one = new Node(-1);
        Node oneTmp = one;
        Node zero = new Node(-1);
        Node zeroTmp = zero;
        Node two = new Node(-1);
        Node twoTmp = two;
 

        while(temp != null) {
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = oneTmp.next != null ? oneTmp.next : twoTmp.next;
        one.next = twoTmp.next;
        two.next = null;
        return zeroTmp.next;

    }
}
