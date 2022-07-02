//SubArray with sum 0
import java.util.*;

public class Array21 {

    //Brute-Force
    //Time : O(n^2)
    //space : O(1)

    /*
    static boolean subArrayExists(int[] arr){

        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){

                if(sum == 0)
                    return true;
                sum = sum+arr[j];
            }
        }

        return false;
    }
    */

    //Approach - 2
    //Time  :O(n)
    //Space : O(n)
    //If a subarray with sum zero exists then there will be a repeated value in cummulative frequency

    static boolean subArrayExists(int[] arr){

        HashMap<Integer,Integer> hp = new HashMap<>(); 
        int sum = arr[0];

        for(int i=1;i<arr.length;i++){

            if(sum == 0 || hp.containsKey(sum))
                return true;
            hp.put(sum,hp.getOrDefault(sum,0)+1);  
            sum+=arr[i];          
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {4 ,2 ,4 ,-3 ,-3};
        System.out.println(subArrayExists(arr));
    }    
}










