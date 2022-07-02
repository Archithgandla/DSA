//Rearrange the positive and negative elements

//Brute force : Store negative,positve elements in seperate arrays and fill them alternatively in the original array


public class Array20 {

    //order is not preserved
    //Time : O(n) Space : O(1)
    /*
    public static int[] posAndNeg(int[] arr){

        int i=0,j=0,k=arr.length-1,temp;

        while(i<=k){

             if(arr[i]>0){

                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                k-=1;
            }

            else
                i+=1;       
        }
        
        System.out.println(arr[i]);
        k = 1;
        //k will be on the first positive element
        if(i==0 || i==arr.length-1)   //i==0: No positive elements, i== length-1 : No negative elements
            return arr;

        while(i<arr.length && k<arr.length){

            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            
            i+=1;
            k+=2;
        }

        return arr;
    }
    */

    //Right Rotation

    static int[] rRotation(int[] arr,int to,int from){

        int temp = arr[to];
        
        for(int i = to;i>from;i--){
            arr[i] = arr[i-1];
        }
        arr[from] = temp;

        return arr;
    }


    static int[] posAndNeg(int[] arr){

        int wrongIndex = -1;

        for(int i=0;i<arr.length-1;i++){

            if(wrongIndex != -1){

                if((arr[wrongIndex]>0 && arr[i]<0) || (arr[wrongIndex]<0 && arr[i]>0))
                    arr = rRotation(arr,i,wrongIndex);
                
                if(i - wrongIndex>=2)
                    wrongIndex+=2;
                
                else
                    wrongIndex = -1;


            }

            else{
                
                if((arr[i]<0 && i%2==1) || (arr[i]>0 && i%2==0)){

                    wrongIndex = i;

                }
            }

        }

        return arr;
    }

    public static void main(String[] args){
        
        int[] arr = {1, 2, 3, -4, -1, 4};

        arr =  posAndNeg(arr);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");


    }
    
}
