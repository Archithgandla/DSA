//Duplicate element in a array of (n+1) elements

import java.util.*;
import java.lang.Math;



public class Array11 {
    
    //Approach-1 :Using HashMap
    //Time : O(n) Space : O(n)
    /*static int findDuplicate(int[] arr){
        
        HashMap<Integer,Integer> ht = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(ht.get(arr[i])==null)
                ht.put(arr[i],1);
            else
                return arr[i];

        }
        return -1;

    }*/

    //Approach - 2 I Like this approach 
    //Kid Ghost problem
    //Array is getting Modified
    //Time : O(n) Space : O(1)

    /*static int findDuplicate(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            temp = Math.abs(arr[i]);
            
            if(arr[temp]<0)
                return Math.abs(arr[i]);
            
            arr[temp]*=-1;;


        }
        return -1;
    }*/

    //Best Approach
    //Assume Array as a Linked List and find cycle,Starting point of loop
    //Time : O(n) Space : O(1)
    //Array is not Modified

    static int findDuplicate(int[] arr){

        int slow = arr[0],fast = arr[0];

        while(true){
            
             slow = arr[slow];
             fast = arr[arr[fast]];

             if(slow == fast)
                break;
        }

        slow = arr[0];

        while(true){
            if(slow == fast)
                return slow;
            
            slow = arr[slow];
            fast = arr[fast];

        }

        
    }

    public static void main(String[] args){

        int[] a = {1,3,4,1,2};
        System.out.println(findDuplicate(a));

    }

}














