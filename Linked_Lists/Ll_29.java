public class Ll_29 {
    
    //Approach - 1
    //Copy the elements into a array and solve it then store it back in the linked list
    //Time : O(n)
    //Space : O(n)


    //Approach - 2
    //Count the number of ones,zeroes and two's and store them in the final linked list
    //Time : O(n)
    //Space : O(1)

    static Node segregate(Node head)
    {
        // add your code here
        
        int count_0 = 0,count_1 = 0,count_2 = 0;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0)
                count_0+=1;
            else if(temp.data == 1)
                count_1+=1;
            else if(temp.data == 2)
                count_2+=1;
            
            temp = temp.next;
        }
        
        temp = head;
        
        while(count_0>0){
            temp.data = 0;
            temp = temp.next;
            count_0-=1;
        }
         
        
        while(count_1>0){
            temp.data = 1;
            temp = temp.next;
            count_1-=1;
        }   
              
        
        while(count_2>0){
            temp.data = 2;
            temp = temp.next;
            count_2-=1;
        }
        
        return head;
    }
    
    //Approach - 3
    //Without Modification of the given array
    //Time : O(n)
    //Space : O(n)
    //Time exceeded error vastundi

    static Node insertAtTail(Node tail,Node mine){
        if(tail == null){
            tail = mine;
            return tail;
        }
        
        tail.next = mine;
        return mine;
        
    }
    
    
    
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate1(Node head)
    {
        // add your code here
        Node dummy0 = new Node(-1);
        Node dummy0tail = dummy0;
        Node dummy1 = new Node(-1);
        Node dummy1tail = dummy1;
        Node dummy2 = new Node(-1);
        Node dummy2tail = dummy2;
        
        Node temp = head;
         //dummy0 = insertAtTail(dummy0,temp);
        
        //Creating seperate Linked Lists
        while(temp!=null){
            
         
            if(temp.data == 0){
                dummy0tail = insertAtTail(dummy0tail,temp);
            }
            
            
            else if(temp.data == 1){
                dummy1tail = insertAtTail(dummy1tail,temp);
            }
            
            
            else if(temp.data == 2){
                dummy2tail = insertAtTail(dummy2tail,temp);
            }
                
            temp = temp.next;
        }
            
    
        if(dummy1.next != null){
            dummy0tail.next = dummy1.next;
        }
        else{
            dummy0tail.next = dummy1.next;
        }
        
        dummy1tail.next = dummy2.next;
        
        return dummy0.next;
    }




}
