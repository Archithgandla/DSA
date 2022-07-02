import java.util.*;
public class SS_2 {
    
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        
        ArrayList<Integer> Al = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == i+1)
                Al.add(arr[i]);
            
            
        }
        return Al;
    }
}
