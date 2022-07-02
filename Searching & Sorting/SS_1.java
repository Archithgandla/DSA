public class SS_1 {
    
    public int First(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid = (start+end)/2;
          
            if(arr[mid] == target && (mid == 0 || arr[mid-1]!=target ))
                return mid;
            
            else if(arr[mid]<target)
                return First(arr,target,mid+1,end);
            
            else if(arr[mid]>=target)
                return First(arr,target,start,mid-1);
        }
        
        return -1;
    }
    
     public static int last(int arr[], int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x && (mid == arr.length-1 || x != arr[mid + 1]))
                return mid;
            else if (arr[mid]>x)
                return last(arr, low, (mid - 1), x);
            else
                return last(arr, (mid + 1), high, x);
        }
        return -1;
    }
    
    
    public int[] searchRange(int[] nums, int target) {
        int[] a = {First(nums,target,0,nums.length-1),last(nums,0,nums.length-1,target)};
        return a;
    }
}
