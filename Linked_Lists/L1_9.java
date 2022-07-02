public class L1_9 {


    static Node reverse(Node head){

        Node prev = null,curr = head,temp;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = temp;
        }
        head = prev;

        return head;
    }


    //Approach -1
    //reverse the linked list
    //Add one to the first node and pass on the carry
    //revere the linked list again

    public static Node addOne1(Node head){

        

        head =  reverse(head);
        Node temp = head;

        if(temp.data != 9){
            temp.data+=1;
        }

    else{
        int carry = 0,data = 0,digit = 0;


       do {
            
        if(temp.next != null){
            data = temp.data+1;
            carry = data/10;
            digit = data%10;
            temp.data = digit;
            }
            else{
                temp.data+=1;
            }

            temp = temp.next;
        }while(carry != 0 && temp!= null);
    }

        head = reverse(head);
        return head;
    }


    //Approach - 2
    //Time - n space - 1

    public static Node addOne(Node head) 
    { 
        //code here     
        Node temp = head,ref = head;
        while(temp.next != null){
            
            if(temp.data != 9)
                ref = temp;
            temp = temp.next;
        }    
        
        
        if(temp.data == 9 && ref != null){
            
            temp = ref;
            temp.data+=1;
            temp = temp.next;
            
            while(temp!= null){
                temp.data = 0;
                temp = temp.next;
            }
            
        }
        
        else{
            temp.data+=1;
        }
        return head;
    }
}
