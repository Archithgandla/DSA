//Detect Loop in a linked list
//Time complexity : O(n)
//Space : O(1)
//Tested in leetcode

class Node{

    int data;
    Node next;

    Node(int content){
        data = content;
        next = null;
    }
}

class SLL{

    Node head = null;
    SLL(Node h){
        head  = h;
    }

    void traverse(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }


}


public class Ll_3 {

    boolean isLoop(Node head){

        Node slow = head,fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
    }

}
