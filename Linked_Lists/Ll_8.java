//Move Last element to first of the linked list




public class Ll_8 {

    public static Node moveToFront(Node head) {
		// Write your code here
		
		if(head == null || head.next == null)
			return head;
		
		Node prev = head,curr = head.next;
		
		while(curr.next != null){
			curr = curr.next;
			prev = prev.next;
		}	
		
		prev.next = null;
		curr.next = head;
		head  = curr;
		return head;
	}


    public static void main(String[] args) {
        
        Node a = new Node(5);
        SLL mine = new SLL(a);

        mine.head = moveToFront(mine.head);
        mine.traverse();
    }
}
