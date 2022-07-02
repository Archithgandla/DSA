//pushing negative element to one side

//approach - 1
//store negative element in a array and positive elements in a seperate array
//at last fill them in the give array,first negative then positive or vice versa

//approach - 2
//sorting

/*approach-3

public class Array5 {
    
    public static void main(String[] args){

        int arr[] = {2,4,-10,13,-7,-60,52,8,-19};
        int i = 0,j = arr.length-1;

        
        while(i<=j){

            if(arr[i]>0 && i<arr.length)
                i+=1;
            
            if(arr[j]<0 && j>=0)
                j-=1;
            
            if(arr[i]<0 && arr[j]>0){
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];

            i+=1;
            j-=1;      
        }
            
        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       

    }


}
*/

//approach-4
//optimized


public class Array5 {
    
    public static void main(String[] args){

    
    }

    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        //In this approach the order of negative elements is not maintained
        int i = arr[0];
        int j = arr[0];
        
        while(j<arr.length){
            if(arr[j]>0){
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];
                
                i+=1;
            }
        
            j+=1;    
        }
    
    }

}
*/