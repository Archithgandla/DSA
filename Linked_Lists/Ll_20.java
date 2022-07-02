public class Ll_20 {
    
    //Approach - 1
    //Travel from tail and store the values in a new Linked List
    
    //Approach - 2
    //Swap next and prev of each node
    public static Node reverseDLL(Node  head){
    //Your code here
    
    Node prev = null,curr = head,temp = null;
    
    while(curr != null){
        temp = curr.next;
        curr.next = prev;
        curr.prev = temp;
        prev = curr;
        curr = temp;
    }
    return prev;
    }
}
