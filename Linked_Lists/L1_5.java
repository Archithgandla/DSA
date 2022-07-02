//Starting point of the Loop

public class L1_5 {
    
    //Method - 1
    //Store nodes in linked list
    //The node which occurs more than once for the first time is the starting point
    //Code : takeuforward


    //Method - 2
    //Length of cycle is needed
    //Time : o(n)
    //Space : o(1)
    //one pointer moves length of ll
    //Now other pointer moves from start and both travel at same speed,The meeting point is starting point
    public int length(Node head){
        
        Node fast = head,slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast)
                break;
        }
        
        
        if(slow != fast || slow.next == null){
            return 0;
        }
        
        int count = 0;
        
        
        do{
            slow = slow.next;
            count+=1;
        }
        while(fast != slow);
        
        return count;
    }
    
    
    
    public Node detectCycle(Node head) {
        
        if(head == null)
            return null;
        
        
        Node fast = head,slow = head;
          
        
        int i = 0,count = length(head);
        slow = head;
        fast = head;
        
        if(count == 0)
            return null;
        
        while(i<count){
            slow = slow.next;
            i+=1;
        }
        
        while(slow != fast){
            slow = slow.next;
            fast  = fast.next;
        }
       
        return slow;
        
        
    }

    //Method - 3
    //Without calculating Length of Linked List
    //1. If a loop is found, initialize a slow pointer to head, let fast pointer be at its position. 
    //2. Move both slow and fast pointers one node at a time. 
    //3. The point at which they meet is the start of the loop.   
    //Time : O(n)
    //Space : O(1)

    public Node detectCycle2(Node head) {
        Node slow = head,fast = head;
        
        while(fast!=null && fast.next!=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                
                while(slow!=fast){
                    
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            
        }
        
        return null;
        
    }
}
