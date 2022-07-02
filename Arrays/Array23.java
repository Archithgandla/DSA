//Maximum product subArray
import java.lang.Math.*;

class Array23 {
    
    
    //Brute Force Approach 
    //Time complexity : O(n^2)
    //Space : O(1)

    /*static int MPS(int[] arr){

        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
            int prod = 1;

            for(int j=i;j<arr.length;j++){
                prod = prod*arr[j];


                if(prod>max){
                    max = prod;
                }
            }

        }
        return max;
    }*/


    //approach-2
    //If 0 is encountered then assume it to be 1
    //Traverse from both the sides and 

    /*static int MPS(int[] arr){

        int prod = 1,max = 1;

        for(int i=0;i<arr.length;i++){

            if(arr[i] == 0)
                prod = 1;
            
            else{
                prod = prod*arr[i];

                if(prod>max)
                    max = prod;

            }
        }

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i] == 0)
                prod = 1;
            
            else{
                prod = prod*arr[i];

                if(prod>max)
                    max = prod;

            }
        }

        return max;
    }*/


    //Most optimized approach
    //Single Iteration
    //Time : O(n)
    //Space : O(1)

    static int MPS(int[] arr){

        int max = arr[0],min = arr[0],res = arr[0];
        int temp;
    
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]<0){
                temp = min;
                min = max;
                max = temp;
            }
            
            max = Math.max(arr[i],max*arr[i]);
            min = Math.min(arr[i],min*arr[i]); 
            res = Math.max(max,res);
        }
        
        return res;
    }


    public static void main(String[] args){
        
        int[] arr = {-2, -40, 0, -2, -3};
        System.out.println(MPS(arr));


        
    }

}



















