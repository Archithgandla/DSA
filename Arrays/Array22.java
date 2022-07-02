//Factorial of a large number

class Node{

    int data;
    Node prev;

    Node(int dat){
        data = dat;
        prev = null;
    }
  
}



public class Array22 {

    static void multiply(Node tail,int n){

        Node temp = tail,prevNode = tail;
        int carry = 0;

        while(temp != null){
            int data = temp.data*n+carry;
            temp.data = data%10;
            carry = data/10;
            prevNode = temp;
            temp = temp.prev;
            
        }

        while(carry != 0){
            prevNode.prev = new Node((int)carry%10);
            carry/=10;
            prevNode = prevNode.prev;
        }

    }

    static void print(Node tail){
        
        if(tail == null)
            return;
        
        print(tail.prev);
        System.out.print(tail.data);
    }




    public static void main(String[] args){

        int n = 50;

        Node mine = new Node(1);

        for(int i=2;i<=n;i++){
            multiply(mine, i);
        }

        print(mine);
            System.out.println(" ");

        
    }
}


















