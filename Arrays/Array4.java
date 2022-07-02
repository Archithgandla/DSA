//sorting the array containing only 0,1,2 without using sorting algorithm
//Ascending order



//optimized approach
class Array4{

    public static void main(String[] args){


        int[] arr = {2,0,1};

        int i=0,j=0,k=arr.length-1;

        while(j<=k && k>=0){

            switch(arr[j]){

                //To change to descending order replace 0 with 2
                case 0:
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                    i+=1;j+=1;
                    break;
                
                case 1:
                    j+=1;
                    break;
               
                //To change to descending order replace 2 with 0
                case 2:
                    arr[k] = arr[k]+arr[j];
                    arr[j] = arr[k]-arr[j];
                    arr[k] = arr[k]-arr[j];
                    k-=1;

            }

        }

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}


//satisfying all the test cases
/*
class Solution {
    public void sortColors(int[] a) {
        
        int i=0,j=0,k=a.length-1,temp=0;
        
        while(j<=k){
            
            if(a[j] == 0){
                
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                
                i+=1;
                j+=1;
            }
            
            else if(a[j] == 2){
                
                 temp = a[k];
                 a[k] = a[j];
                 a[j] = temp;
                
                k-=1;
                
            }
            else{
                j+=1;
            }
            
            
            
            
        }        
    }
}

*/






















/*
public class Array4 {
    
    public static void main(String[] args){

        int[] arr = {1,1,0,2,1,0,1,2,1};
        int count_0=0,count_1=0,count_2=0;
        int i;

        for(i=0;i<arr.length;i++){
            if(arr[i] == 0)
                count_0+=1;

            else if(arr[i] == 1)
                count_1+=1;

            else
                count_2+=1;
        }

       int j=0;
       i = 0;

       while(i<count_0){
        arr[j] = 0;
        j+=1;
        i+=1;
       }

       i=0;
       while(i<count_1){
        arr[j] = 1;
        j+=1;
        i+=1;
       }

       i=0;
       while(i<count_2){
        arr[j] = 2;
        j+=1;
        i+=1;
       }

       
       for(i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
       }
        

    }

}


*/












