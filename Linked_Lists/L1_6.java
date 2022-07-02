//Remove duplicates from a sorted linked list

public class L1_6 {
    public Node deleteDuplicates(Node head) {
        
        Node ref = head,temp = head;
        
        
        while(temp != null){
            
            while(temp != null && ref.data == temp.data){
                temp = temp.next;
            }
            
            ref.next = temp;
            ref = temp;
            
        }
        
        return head;
    }
}
