//count the number of pairs whose sum is equal to given number

import java.util.*;




public class Array18 {
    
    //approach-1 Nested Loops
    /*static int countPairs(int[] arr,int value){

        int count = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == value)
                    count+=1;
            }
        }
        return count;
    }*/


    //approach-2

    static int countPairs(int[] arr,int value){

        HashMap<Integer,Integer> ht = new HashMap<>();
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(ht.containsKey(value-arr[i]))
                count+=ht.get(value-arr[i]);
            
            ht.put(arr[i],ht.getOrDefault(arr[i],0)+1);

        }
        return count;
    }


    public static void main(String[] args){

        int[] arr = {1 ,2, 2 ,2 ,3 ,4};
        System.out.println(countPairs(arr,4));


    }
}
