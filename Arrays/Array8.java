//Maximum Sum sub array
//Approach-1 brute force : find max of all sub arrays and take maximum from it


public class Array8 {
        
    static int maxSumSubArray(int[] arr){

        int sum = 0,max = -10000; //Taken Maximum Value Based on the  Constraints given in the problem

        for(int i=0;i<arr.length;i++){

            sum = sum+arr[i];

            if(sum>max)
                max = sum;
            
            if(sum<0)
                sum = 0;

        }

        return max;
    }


    public static void main(String[] args){

        int[] arr = {-100,-1};

        System.out.println(maxSumSubArray(arr));

    }

}















