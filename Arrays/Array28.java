//Tripplet sum in a array

import java.util.*;


public class Array28 {
      
    /*Brute Force Approach
    static void trisum(int[] arr,int sum){

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == sum)
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }   
    }
    */


    //Better Approach
    //Time complexity : O(n^2)
    //Space complecity : O(1)

    static void trisum(int[] arr,int sum){

        int remain = 0;
        HashMap<Integer,Integer> ht = new HashMap<>();

        for(int i=0;i<arr.length-1;i++){

            remain  = sum - arr[i];
                      
            for(int j = i+1;j<arr.length;j++){

                if(ht.containsKey(remain-arr[j])){
                   System.out.println(arr[i]+" "+arr[j]+" "+(remain-arr[j])); 
                }

                ht.put(arr[j],ht.getOrDefault(remain-arr[j],0)+1);
        
            }
            ht.clear();
        }
    }

    public static void main(String[] args){
        
        int arr[] = {1 ,2 ,4 ,3 ,6};
        trisum(arr, 10);
       
    }
}
