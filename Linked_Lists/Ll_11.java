public class Ll_11 {
    

    //Approach - 1
    //Brute Force
    //For one element of linked list check in the other linked list
    //Time : O(M*N) Space : O(M+N)

    //Approach - 3
    //Using Hashmap
    //Store data of all items in a HashMap
    //Now traverse through other linked and check for common elements

    //Approach - 2
    //Just like merge sort merging
    //Time : O(M+N) Space : O(M+N)

    public static Node insertAtTail(Node head,int data){
        
        if(head == null){
            head = new Node(data);
            return head;
        }
        
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
            
        temp.next = new Node(data);
        
        return head;
    }


   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        
        Node temp1 = head1,temp2 = head2,dummy  = new Node(-1),curr = dummy;
        
        while(temp1 != null && temp2 != null){
            
            if(temp1.data > temp2.data)
                temp2 = temp2.next;
            
            else if(temp1.data < temp2.data)
                temp1 = temp1.next;
            
            else{
                //Instead of this dummy evertime we can also insertAtTail function and return the head

                curr.next = new Node(temp1.data);
                curr = curr.next;
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
        }
        
        
        return dummy.next;
    }
}
