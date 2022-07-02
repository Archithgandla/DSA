//Check wheter a linked list is circular or not

public class Ll_16 {
    
    boolean isCircular(Node head)
    {
	// Your code here
	
	    if(head == null)
	        return true;

	    Node temp =  head;
	    
	    while(temp!=null){
	        
	        temp = temp.next;
	        if(temp == head)
	            return true;
	        
	    }
	   return false;	
    }

}
