//Element appeared more than n/k times
import java.util.*;
import java.lang.Math;

public class Array25 {

    //Approach - 1
    //Brute Force
    //Time : O(n^2)
    //Space : O(1)
    //Use nested for loop and count occurence of each element
    
    
    //Approach - 2
    //Time - O(n)
    //Space - O(n)
    /*
    static void printElements(int arr[],int k){

        HashMap<Integer,Integer> hm = new HashMap<>();
        double n = Math.ceil(arr.length/k);

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);            
        }

        for(Integer i:hm.keySet()){

            if(hm.get(i)>n)
                System.out.println(i);
        }
    }
    */
    //Approach-3
    //Time : O(nlogn)
    //Space : O(n)

    static void printElements(int[] arr,int k){

        Arrays.sort(arr);
        double n = Math.ceil(arr.length/k);
        int count = 1;
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[i] == arr[i-1])
                count+=1;
            else{
                if(count>n)
                    System.out.println(arr[i-1]);
                count=1;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 3, 5, 4,
            2, 2, 3, 1, 1, 1};
        printElements(arr,4);
    }
}


