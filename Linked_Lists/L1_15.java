public class L1_15 {
    public Node middleNode(Node head) {
        Node fast = head,slow = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
}
