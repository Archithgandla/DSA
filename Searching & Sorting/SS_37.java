//Peak Index in a mountain Array

public class SS_37 {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0,end = arr.length-1;
        int mid = (start+end)/2;
        
        while(start<end){
            System.out.println(start+" "+end+" "+mid);
            
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                return mid;
            
            
            else if(arr[mid]<arr[mid+1])
                start = mid+1;
            
            else if(arr[mid]>arr[mid+1])
                end = mid - 1;
            
            mid = (start+end)/2;
            
        }
        return start;   
    }

    public int peakIndexInMountainArray2(int[] arr) {
        
        int start = 0,end = arr.length-1;
        int mid = (start+end)/2;
        
        while(start<end){
            System.out.println(start+" "+end+" "+mid);
            
            if(arr[mid]<arr[mid+1])
                start = mid+1;
            
            //Not mid+1 because if mid = mountain then it should not be eliminated for this purpose we consider one extra element every time to avoid extra if condition
            else
                end = mid;
            
            mid = (start+end)/2;
            
        }
        return start;
        
    }


}
