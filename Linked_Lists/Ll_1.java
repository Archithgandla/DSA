

//Linked List

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

    //using iteration
    /*void reverse(){

        Node prev = null,curr = head,temp;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = temp;
        }
        head = prev;
    }*/

}

class Ll_1{

    static Node R_reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = R_reverse(head.next);

        Node headnext = head.next;
        headnext.next = head;
        head.next = null;
        
        
        return newHead;

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
        mine.head = R_reverse(mine.head);
        System.out.println(" ");
        mine.traverse();
    }
}



