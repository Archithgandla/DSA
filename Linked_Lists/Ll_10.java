//Addition of two numbers represented by Linked Lists


public class Ll_10 {
    
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

    static int length(Node head){

        Node temp = head;
        int len = 0;

        while(temp != null){
            len+=1;
            temp = temp.next;
        }
        return len;

    }

    static Node addTwoLists(Node a,Node b){

        a = reverse(a);
        b = reverse(b);

        Node big,small,temp;
        int data = 0,digit=0,carry=0;        

        if(length(a)>length(b)){
            big = a;small = b;
        }  
        else{
            big = b;small = a;
        }
        temp = big;
        while(small!=null){
            data = big.data+small.data+carry;
            digit = data%10;
            carry = data/10;
            big.data = digit;
            big = big.next;
            small = small.next;
        }

        while(carry!=0 && big!=null){
            data = big.data+carry;
            digit = data%10;
            carry = data/10;
            big.data = digit;
            big = big.next;
        }

        
        return reverse(temp);
    }
}





