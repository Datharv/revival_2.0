
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(head == null || head.next == null) return ans;
        

        int count = 1;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        
        Node curr = head;
        Node tail = temp;
        while(curr != tail && curr.prev != tail && tail.next != curr) {
            if(curr.data + tail.data == target){
                ArrayList<Integer> sub = new ArrayList<>();
                sub.add(curr.data);
                sub.add(tail.data);
                ans.add(sub);
                curr = curr.next;
                tail = tail.prev;
            }else if(curr.data + tail.data < target) {
                curr = curr.next;
            }else {
                tail = tail.prev;
            }
            
        }
        return ans;
    }
    
}
        
 
