
class Node{

    int data;
    Node next;

    Node(int content){
        data = content;
        next = null;
    }
}

class SLL{

    Node head = null;
    SLL(Node h){
        head  = h;
    }

    void traverse(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
}




public class Ll_2 {

    public static Node kReverse(Node head, int k) {
		// write your code here
		
		if(head == null)
            return head;
        
        Node prev = null,curr = head,temp = null;
        int count = 0;
        
        //reversing the first K nodes using iteration
        while( curr != null && count<k){
             temp = curr.next;   
             curr.next = prev;
             prev = curr;
             curr = temp; 
             count+=1;
        }
        
        
        //if there only K nodes there is no need to recursion
        if(temp != null){
        
            head.next = kReverse(temp,k);
        }
        
        //New Head resides at the prev pointer
        return prev;

	}

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        SLL mine = new SLL(a);

        mine.traverse();
        mine.head =  kReverse(a,3);
        System.out.println("\n");
        mine.traverse();


    }
}
