//Linked List palindrome

//Approach - 1
//Store the LL values in a arr and check array palindrome
//time : n space : 1

//Approach - 2
//Reverse the given ll and store it in a new ref
//Compare it with original Linked List
//time : n space : 1



public class Ll_18 {
   

    //Approach-3
    //reverse the linked List from Mid and compare two parts
    //Time - n space - 1
    public Node reverse(Node head){
        
        Node prev = null,curr = head,temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    public Node middle(Node head){
        
        Node slow = head,fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
      
    public boolean isPalindrome(Node head) {
        
        Node mid = middle(head);
        Node tail = reverse(mid);
               
        
        while(tail!=null && head!=null){
            
            System.out.println('a');
            if(head.data != tail.data)
                return false;
            
            tail = tail.next;
            head = head.next;
        }
        return true;
    }

    
}
