class Node{
    int val;
    Node prev;
    Node next;

    public Node(int val, Node prev, Node next) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node node = new Node(5);
        Node one = new Node(6, node, null);
        node.next = one;


        int[] arr = {1, 2, 3, 4, 5};
        Node temp = createDoublyLinkedList(arr);

//        Node head = insertNode(temp, 10, 6);
        Node head = deleteNode(temp, 4);
        Node prev  = head;
        while(head != null){
            System.out.println("node : " + head.val);
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

    public static Node insertNode(Node curr, int val, int pos){
        Node temp = new Node(val);

        if(pos == 1) {
            temp.next = curr;
            curr.prev = temp;
            return temp;
        }

        int count = 1;
        Node head = curr;
        while(curr != null && count <= pos) {

            if(count == pos-1) {
                temp.next = curr.next;
                temp.prev = curr;
                if(curr.next != null)
                    curr.next.prev = temp;
                curr.next = temp;
                break;
            }
            curr = curr.next;
            count++;
        }
        return head;
    }

    public static Node deleteNode(Node head, int pos) {
        if(pos == 1) {
            return head.next;
        }

        Node curr = head;
        int count = 1;
        while(curr != null && count <= pos){
            if(pos == count){
                curr.prev.next = curr.next;
                if(curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                break;
            }
            curr=curr.next;
            count++;
        }
        return head;
    }
}
