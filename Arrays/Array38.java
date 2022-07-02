//Moving Zeroes Hackerrank

import java.util.*;



public class Array38 {
    
    //Approach-1 
    public void moveZeroes(int[] nums) {
    
        List<Integer> zeroes = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
         
         for(int i=0;i<nums.length;i++){
             
             if(nums[i] == 0)
                 zeroes.add(nums[i]);
             
             else
                 arr.add(nums[i]);
         }
         
        
         
         for(int i = 0;i<arr.size();i++){
             nums[i] = arr.get(i);
            
             
         }
         
          int k=0;
          for(int i=arr.size() ;i<nums.length;i++){
          
             nums[i] = zeroes.get(k);
             k+=1;
         }
     }
}

/* Approach-2 
But not working for few test cases

public void moveZeroes(int[] arr) {
            
            int i = 0,j = 1,temp = 0,flag = 0;
        
            while(j<arr.length && i<arr.length){
                
                if(arr[i] != 0 && i<arr.length-1){
                    i+=1; 
                    System.out.println("i : "+i);
                    
                }
                
                if(arr[j] == 0 && j<arr.length-1){
                    j+=1;
                    System.out.println("j : "+j);
                }
                
                            
                if(arr[i] == 0 && arr[j] !=0){
                    
                    System.out.println("i : "+i);
                    System.out.println("j : "+j);
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
                    i+=1;
                    j+=1;
                    
                }
                
                          
                
            } 
        }
*/

/*MOST OPTIMIZED APPROACH


public void moveZeroes(int[] arr) {
    int count = 0;
    
    for(int i=0;i<arr.length;i++){
        
        if(arr[i] != 0)
            arr[count++] = arr[i];
    }

    while(count<arr.length){
        arr[count] = 0;
        count+=1;
    
    }
}

*/






