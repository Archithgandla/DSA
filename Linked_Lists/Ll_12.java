public class Ll_12 {
    

    //Approach -1
    //Brute Force
    //time : n^2 space : 1
    //Exceeding time for large inputs

    int intersectPoint(Node head1, Node head2)
	{
         // code here
        Node dummy1 = new Node(-1),dummy2 = new Node(-1);
        dummy1.next = head1;
        dummy2.next = head2;
        
        
        
        Node temp1 = dummy1,temp2 = dummy2;
            
        while(temp1 != null){           
            temp1 = temp1.next;
            
            
            while(temp2 != null && temp1 != null){
            
                temp2 = temp2.next;
                     
                if(temp1 == temp2)
                    return temp1.data;
            }
            temp2 = dummy2;
        }
     
        return -1;
	}



    //Approach - 2
    //Use hashMap

    //Approach - 3
    //Find length of both the lists.
    //Find the positive difference of these lengths.
    //Move the dummy pointer of the larger list by difference achieved. This makes our search length reduced to the smaller list length.
    //Move both pointers, each pointing two lists, ahead simultaneously they will meet at intersection if not they become equal at null(No intersection).


    //Approach-3
    //Time : n space : 1
    public Node getIntersectionNode(Node head1, Node head2) {
        
        // code here
        Node dummy1 = new Node(-1),dummy2 = new Node(-1);
        dummy1.next = head1;
        dummy2.next = head2;
        
        Node temp1 = dummy1,temp2 = dummy2;
        
        while(true){
            temp1 = temp1.next;
            temp2 = temp2.next;
            
             if(temp1 == temp2)
                return temp1;
            
            if(temp1 == null)
                temp1 = dummy2;
            
            if(temp2 == null)
                temp2 = dummy1; 
        }
        
    }

    //Better code for above approach

    public Node getIntersectionNode2(Node head1, Node head2) {
        
        // code here
        Node d1 = head1;
        Node d2 = head2;
    
    while(d1 != d2) {
        d1 = d1 == null? head2:d1.next;
        d2 = d2 == null? head1:d2.next;
    }
    
    return d1;
    }
}



