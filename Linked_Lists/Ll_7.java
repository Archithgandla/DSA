//Delete duplicates from a unsorted linked list
import java.util.*;

public class Ll_7 {
    
    //Approach - 1
    //Brute Force:nested loop
    //For every node check wheter another occurence is present
    //Time : O(n^2) space : O(1)

    //Approach - 2
    //Sort the linked list - O(nlogn)
    //Apply technique used on sorted linked list
    //Time : O(nlogn+n)=>nLogn space - const

    //Approach
    //Time : O(n)
    //Space : O(nlogn)


    public static Node removeDuplicates(Node head) {

        // Write your code here	
		
		if(head == null)
			return null;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		Node curr = head,temp = head.next;
		hm.put(curr.data,1);
		
		while(temp != null){
			
			if(hm.containsKey(temp.data)){
				temp = temp.next;
                curr.next = temp;
				continue;
			}
			hm.put(temp.data,1);
			curr.next = temp;
			curr = curr.next;
			temp = temp.next;
		}
		System.out.println(hm);
		return head;
	}
	

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(2);
        Node g = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        SLL mine = new SLL(a);

        mine.head = removeDuplicates(mine.head);
        mine.traverse();

    }
    
}





