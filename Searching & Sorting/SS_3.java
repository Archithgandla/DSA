public class SS_3 {
    //Approach -1 
    //Simple linear search

    //Approach -2
    //Binary search
    //First find the pivot element
    //Based on the pivot divide the array into two sorted arrays
    //Now using a condition find target is in which part and apply binary search in that part


    public int findMin(int[] arr) {
        
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
    
         return low;
           
}
       
    
    public int search(int[] arr, int target) {
        
        int pivot = findMin(arr);
        
        int low = -1,high = -1,mid = -1;
        
        
        //It means that the element is in the right part so we are applying BS in right part
        if(target>=arr[pivot] && target<=arr[arr.length-1]){
            low = pivot;high = arr.length-1;
        }
        
         //It means that the element is in the left part so we are applying BS in Left part
        else{
            low = 0;high = pivot-1;
        }
        
        mid = (low+high)/2;
        System.out.println(pivot+" "+low+" "+high);
        
        while(low<=high){
            
            if(target>arr[mid]){
                low = mid+1;
            }
            
            else if(target<arr[mid]){
                high = mid-1;
            }
            
            else
                return mid;
            
            mid = (low+high)/2;
        }
        
        return -1;
    }
    
}
