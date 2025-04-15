public class ReverseDoublyLL {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node temp = createDoublyLinkedList(arr);
        Node head = reverseDLL(temp);

        Node prev = head;
        while (head != null) {
            System.out.println("head : " + head.val);
            prev = head;
            head = head.next;
        }

        while(prev != null) {
            System.out.println("prev : " + prev.val);
            prev = prev.prev;
        }

    }

    public static Node createDoublyLinkedList(int [] arr){

        Node head = new Node(arr[0]);
        Node left = head;
        for(int i = 1;i<arr.length;i++) {
            Node curr = new Node(arr[i]);
            curr.prev = left;
            left.next = curr;
            left = curr;
        }
        return head;
    }

    public static Node reverseDLL(Node head){
        if(head == null || head.next == null) return head;
        Node left = null;
        Node curr = head;

        while(curr != null) {
            Node right = curr.next;
            curr.next = left;
            curr.prev = right; //most important need to update both pointer
            left = curr;
            curr = right;
        }
        return left;
    }
}
