//Delete Loop from a Linked List

public class L1_4 {


    Node deleteLoop(Node head){

        if(head == null)
            return null;

        Node slow = head,fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next;

            if(slow == fast){
                
                Node temp = null;
                slow = head;
                
                while(slow != head){
                    temp = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                temp.next = null;
                return head;
            }

        }


        return null;
    }

    public static void main(String[] args) {
        System.out.println("Archith");
    }    
}







