
//Minimum number of operations to make the array an palindrome
//Operation refers to addition of a element with its pervious element
//A single element is always considered as a palindrome



public class Array34 {

    static int minOperation(int[] arr){

        int ans = 0,i = 0,j = arr.length-1;

        while(i<=j){

            if(arr[i] == arr[j]){
                i+=1;j-=1;
            }

            //mergining 
            else if(arr[i]<arr[j]){
                i+=1;
                arr[i]+=arr[i-1];
                ans+=1;
            }

            else{
                j-=1;
                arr[j]+=arr[j-1];
                ans+=1;
            }
            
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1, 4, 5, 1};
        System.out.println(minOperation(arr));

    }    
}
