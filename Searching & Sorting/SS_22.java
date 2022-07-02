//Min and Max elemnt in a rotated array

//Approach - 1
//Linear search approach
//Time : O(n)
public class SS_22 {
    
    //Approach - 2
    //Binary search approach
    //Time complexity : O(logn)
    //Low mid and high meet at our desired min or max


    public static int findMin(int[] arr) {
        
        int low = 0,high = arr.length-1;
        
        //If array is not rotated
        if(arr[low]<arr[high])
            return arr[low];
        
        int mid = (low+high)/2;
        
        while(low<high){
            
            if(arr[0]<=arr[mid])
                low = mid+1;
            
            //Not mid-1 because if mid is min element then we min element
            else
                high = mid;
        
            mid = (low+high)/2;
    }
    
    return arr[low];
           
}

public static int findMax(int[] arr) {
        
    int low = 0,high = arr.length-1;
    
    //If array is not rotated
    if(arr[low]<arr[high])
        return arr[arr.length-1];
    
    int mid = (low+high)/2;
    
    while(low<high){
        //Not mid+1 because if mid is max element we will miss our max element
        if(arr[0]<=arr[mid])
            low = mid;
        
        else
            high = mid-1;
    
        mid = (low+high)/2;
}

    return arr[low];
       
}

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findMax(arr)+" "+findMin(arr));
    }
}
